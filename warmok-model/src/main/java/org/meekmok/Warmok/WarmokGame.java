/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok;

import org.eclipse.emf.common.util.EList;

import org.meekmok.Games.Game;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.WarmokGame#getWorld <em>World</em>}</li>
 *   <li>{@link org.meekmok.Warmok.WarmokGame#getNations <em>Nations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getWarmokGame()
 * @model
 * @generated
 */
public interface WarmokGame extends Game {
	/**
	 * Returns the value of the '<em><b>World</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World</em>' reference.
	 * @see #setWorld(World)
	 * @see org.meekmok.Warmok.WarmokPackage#getWarmokGame_World()
	 * @model required="true"
	 * @generated
	 */
	World getWorld();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.WarmokGame#getWorld <em>World</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World</em>' reference.
	 * @see #getWorld()
	 * @generated
	 */
	void setWorld(World value);

	/**
	 * Returns the value of the '<em><b>Nations</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Warmok.Nation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nations</em>' reference list.
	 * @see org.meekmok.Warmok.WarmokPackage#getWarmokGame_Nations()
	 * @model
	 * @generated
	 */
	EList<Nation> getNations();

} // WarmokGame
