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
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Games.Profile#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Games.Profile#getOpenid <em>Openid</em>}</li>
 *   <li>{@link org.meekmok.Games.Profile#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Games.GamesPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.meekmok.Games.GamesPackage#getProfile_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.meekmok.Games.Profile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Openid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openid</em>' attribute.
	 * @see #setOpenid(String)
	 * @see org.meekmok.Games.GamesPackage#getProfile_Openid()
	 * @model
	 * @generated
	 */
	String getOpenid();

	/**
	 * Sets the value of the '{@link org.meekmok.Games.Profile#getOpenid <em>Openid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openid</em>' attribute.
	 * @see #getOpenid()
	 * @generated
	 */
	void setOpenid(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Games.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see org.meekmok.Games.GamesPackage#getProfile_Players()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayers();

} // Profile
