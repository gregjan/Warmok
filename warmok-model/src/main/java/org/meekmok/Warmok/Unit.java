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
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.Unit#getNation <em>Nation</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Unit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Nation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.meekmok.Warmok.Nation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nation</em>' reference.
	 * @see #setNation(Nation)
	 * @see org.meekmok.Warmok.WarmokPackage#getUnit_Nation()
	 * @see org.meekmok.Warmok.Nation#getUnits
	 * @model opposite="units" required="true"
	 * @generated
	 */
	Nation getNation();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Unit#getNation <em>Nation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nation</em>' reference.
	 * @see #getNation()
	 * @generated
	 */
	void setNation(Nation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(UnitType)
	 * @see org.meekmok.Warmok.WarmokPackage#getUnit_Type()
	 * @model required="true"
	 * @generated
	 */
	UnitType getType();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Unit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(UnitType value);

} // Unit
