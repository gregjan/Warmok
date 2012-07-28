package com.meekmok.games;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>Profiles</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Profiles {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<Profile> profiles = new ArrayList<Profile>();

	/**
	 * Returns the value of '<em><b>profiles</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>profiles</b></em>' feature
	 * @generated
	 */
	public List<Profile> getProfiles() {
		return profiles;
	}

	/**
	 * Adds to the <em>profiles</em> feature.
	 * @generated
	 */
	public void addToProfiles(Profile profilesValue) {

		if (!profiles.contains(profilesValue)) {

			profiles.add(profilesValue);

		}

	}

	/**			
	 * Removes from the <em>profiles</em> feature.
	 * @generated
	 */
	public void removeFromProfiles(Profile profilesValue) {
		if (profiles.contains(profilesValue)) {
			profiles.remove(profilesValue);
		}
	}

	/**			
	 * Clears the <em>profiles</em> feature.
	 * @generated
	 */
	public void clearProfiles() {
		for (Profile profilesElement : profiles) {
			removeFromProfiles(profilesElement);
		}
	}

	/**
	 * Sets the '{@link Profiles#getProfiles() <em>profiles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Profiles#getProfiles() profiles}' feature.
	 * @generated
	 */
	public void setProfiles(List<Profile> newProfiles) {
		profiles = newProfiles;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Profiles ";
	}
}
