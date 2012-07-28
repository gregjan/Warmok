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
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Games.Game#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Games.GamesPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link org.meekmok.Games.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see org.meekmok.Games.GamesPackage#getGame_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

} // Game
