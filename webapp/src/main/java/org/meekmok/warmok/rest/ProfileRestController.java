package org.meekmok.warmok.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import org.meekmok.Games.Profile;
import org.meekmok.Games.impl.ProfileImpl;
import org.meekmok.warmok.dao.ProfileDao;

@Path("/profile")
public class ProfileRestController {

	@Context
	UriInfo uriInfo;
	
	@Context
	Request request;
	
	@GET
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<com.meekmok.games.Profile> get() {
		 List<Profile> eObjects = ProfileDao.instance.getList();
		 List<Object> convertedModelObjects = new EMFModelConverter().convert(eObjects);
	}
	
	@GET
	@Path("{id}")
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Profile get(@PathParam("id") String id) {
		return ProfileDao.instance.get(id);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response put(JAXBElement<ProfileImpl> profile) {
		// TODO how to create profile via factory JAXB is wrong..
		Profile p = profile.getValue();
		return putAndGetResponse(p);
	}
	
	private Response putAndGetResponse(Profile profile) {
		Response res = null;
		if(ProfileDao.instance.getList().contains(profile)) {
			res = Response.noContent().build();
		} else {
			String id = ProfileDao.instance.add(profile);
			try {
				res = Response.created(new URI(id)).build();
			} catch (URISyntaxException ignored) {
			}
		}
		return res;
	}
}
