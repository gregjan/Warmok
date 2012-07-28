/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.Orders#getNation <em>Nation</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Orders#getMoves <em>Moves</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Orders#isCompleted <em>Completed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getOrders()
 * @model
 * @generated
 */
public interface Orders extends EObject {
	/**
	 * Returns the value of the '<em><b>Nation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nation</em>' reference.
	 * @see #setNation(Nation)
	 * @see org.meekmok.Warmok.WarmokPackage#getOrders_Nation()
	 * @model required="true"
	 * @generated
	 */
	Nation getNation();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Orders#getNation <em>Nation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nation</em>' reference.
	 * @see #getNation()
	 * @generated
	 */
	void setNation(Nation value);

	/**
	 * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
	 * The list contents are of type {@link org.meekmok.Warmok.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' containment reference list.
	 * @see org.meekmok.Warmok.WarmokPackage#getOrders_Moves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getMoves();

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(boolean)
	 * @see org.meekmok.Warmok.WarmokPackage#getOrders_Completed()
	 * @model required="true"
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Orders#isCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #isCompleted()
	 * @generated
	 */
	void setCompleted(boolean value);

} // Orders
