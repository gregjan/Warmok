/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Games;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Games.Player#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Games.GamesPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(Profile)
	 * @see org.meekmok.Games.GamesPackage#getPlayer_Profile()
	 * @model required="true"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link org.meekmok.Games.Player#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

} // Player
