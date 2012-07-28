/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Games;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Games.Profiles#getProfiles <em>Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Games.GamesPackage#getProfiles()
 * @model
 * @generated
 */
public interface Profiles extends EObject {
	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Games.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' reference list.
	 * @see org.meekmok.Games.GamesPackage#getProfiles_Profiles()
	 * @model
	 * @generated
	 */
	EList<Profile> getProfiles();

} // Profiles
