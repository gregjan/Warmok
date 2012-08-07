package org.meekmok.warmok.dao;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.meekmok.Games.GamesFactory;
import org.meekmok.Games.GamesPackage;
import org.meekmok.Games.Profile;
import org.meekmok.Games.Profiles;
import org.meekmok.Games.impl.ProfileImpl;
import org.meekmok.Warmok.WarmokPackage;

public enum ProfileDao {
	instance;
	
	private static final Map<Object,Object> saveOptions = new HashMap<Object,Object>();
	
	static {
		saveOptions.put(XMLResource.OPTION_ENCODING, "utf-8");
	}

	private static final String FILE_NAME = "profiles.xmi";
	GamesPackage gamesPackage = GamesPackage.eINSTANCE;
	WarmokPackage warmokPackage = WarmokPackage.eINSTANCE;

	private XMIResourceImpl resource = null;
	
	ProfileDao() {
		File f = new File(FILE_NAME);
		if(f.exists()) {
			loadModel();
		} else {
			createModel();
		}
	}

	public List<Profile> getList() {
		return ((Profiles) resource.getAllContents().next()).getProfiles();
	}
	
	private Profiles getProfiles() {
		return (Profiles) resource.getAllContents().next();
	}

	public Profile get(String id) {
		return (Profile)resource.getEObject(id);
	}

	private void createModel() {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						fact);

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(FILE_NAME).getAbsolutePath());

		// Create a resource for this file.
		resource = (XMIResourceImpl) resourceSet.createResource(fileURI);


		// Add the Profiles object
		Profiles profiles = GamesFactory.eINSTANCE.createProfiles();
		resource.getContents().add(profiles);
		
		// Add example Profile
		Profile example = GamesFactory.eINSTANCE.createProfile();
		example.setName("Example Profile");
		example.setOpenid("example@google.com");
		profiles.getProfiles().add(example);

		// Save the contents of the resource to the file system.
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
		}
	}

	private void loadModel() {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(FILE_NAME).getAbsolutePath());

		// Demand load the resource for this file.
		resource = (XMIResourceImpl) resourceSet.getResource(fileURI, true);

		// Print the contents of the resource to System.out.
		try {
			resource.save(System.out, saveOptions);
		} catch (IOException e) {
		}
	}
	
	private void saveModel() {
		// Save the contents of the resource to the file system.
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
		}
	}

	public String add(Profile profile) {
		this.getProfiles().getProfiles().add(profile);
		this.saveModel();
		return this.resource.getID(profile);
	}
	
}
