/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.UnitType#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.UnitType#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.meekmok.Warmok.UnitType#getFight <em>Fight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getUnitType()
 * @model
 * @generated
 */
public interface UnitType extends EObject {
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
	 * @see org.meekmok.Warmok.WarmokPackage#getUnitType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.UnitType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement</em>' attribute.
	 * @see #setMovement(int)
	 * @see org.meekmok.Warmok.WarmokPackage#getUnitType_Movement()
	 * @model required="true"
	 * @generated
	 */
	int getMovement();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.UnitType#getMovement <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement</em>' attribute.
	 * @see #getMovement()
	 * @generated
	 */
	void setMovement(int value);

	/**
	 * Returns the value of the '<em><b>Fight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fight</em>' attribute.
	 * @see #setFight(int)
	 * @see org.meekmok.Warmok.WarmokPackage#getUnitType_Fight()
	 * @model required="true"
	 * @generated
	 */
	int getFight();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.UnitType#getFight <em>Fight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fight</em>' attribute.
	 * @see #getFight()
	 * @generated
	 */
	void setFight(int value);

} // UnitType
