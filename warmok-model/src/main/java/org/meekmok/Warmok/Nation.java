/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.meekmok.Games.Player;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.Nation#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getType <em>Type</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getTreasury <em>Treasury</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getStartTerritory <em>Start Territory</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getTerritories <em>Territories</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Nation#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getNation()
 * @model
 * @generated
 */
public interface Nation extends EObject {
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
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(NationType)
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Type()
	 * @model
	 * @generated
	 */
	NationType getType();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NationType value);

	/**
	 * Returns the value of the '<em><b>Treasury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treasury</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treasury</em>' attribute.
	 * @see #setTreasury(int)
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Treasury()
	 * @model required="true"
	 * @generated
	 */
	int getTreasury();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getTreasury <em>Treasury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treasury</em>' attribute.
	 * @see #getTreasury()
	 * @generated
	 */
	void setTreasury(int value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' attribute.
	 * @see #setLeader(String)
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Leader()
	 * @model required="true"
	 * @generated
	 */
	String getLeader();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getLeader <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' attribute.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(String value);

	/**
	 * Returns the value of the '<em><b>Start Territory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Territory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Territory</em>' reference.
	 * @see #setStartTerritory(Territory)
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_StartTerritory()
	 * @model
	 * @generated
	 */
	Territory getStartTerritory();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Nation#getStartTerritory <em>Start Territory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Territory</em>' reference.
	 * @see #getStartTerritory()
	 * @generated
	 */
	void setStartTerritory(Territory value);

	/**
	 * Returns the value of the '<em><b>Territories</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Warmok.Territory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Territories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Territories</em>' reference list.
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Territories()
	 * @model
	 * @generated
	 */
	EList<Territory> getTerritories();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Warmok.Unit}.
	 * It is bidirectional and its opposite is '{@link org.meekmok.Warmok.Unit#getNation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference list.
	 * @see org.meekmok.Warmok.WarmokPackage#getNation_Units()
	 * @see org.meekmok.Warmok.Unit#getNation
	 * @model opposite="nation"
	 * @generated
	 */
	EList<Unit> getUnits();

} // Nation
