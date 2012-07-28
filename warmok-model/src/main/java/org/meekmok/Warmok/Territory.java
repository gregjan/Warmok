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
 * A representation of the model object '<em><b>Territory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.Territory#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Territory#getCenter <em>Center</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Territory#getAdjacentTo <em>Adjacent To</em>}</li>
 *   <li>{@link org.meekmok.Warmok.Territory#isHabitable <em>Habitable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getTerritory()
 * @model
 * @generated
 */
public interface Territory extends EObject {
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
	 * @see org.meekmok.Warmok.WarmokPackage#getTerritory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Territory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' reference.
	 * @see #setCenter(GeoPoint)
	 * @see org.meekmok.Warmok.WarmokPackage#getTerritory_Center()
	 * @model required="true"
	 * @generated
	 */
	GeoPoint getCenter();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Territory#getCenter <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>Adjacent To</b></em>' reference list.
	 * The list contents are of type {@link org.meekmok.Warmok.Territory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacent To</em>' reference list.
	 * @see org.meekmok.Warmok.WarmokPackage#getTerritory_AdjacentTo()
	 * @model required="true"
	 * @generated
	 */
	EList<Territory> getAdjacentTo();

	/**
	 * Returns the value of the '<em><b>Habitable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Habitable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitable</em>' attribute.
	 * @see #setHabitable(boolean)
	 * @see org.meekmok.Warmok.WarmokPackage#getTerritory_Habitable()
	 * @model required="true"
	 * @generated
	 */
	boolean isHabitable();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.Territory#isHabitable <em>Habitable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Habitable</em>' attribute.
	 * @see #isHabitable()
	 * @generated
	 */
	void setHabitable(boolean value);

} // Territory
