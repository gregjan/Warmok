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
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.World#getImage <em>Image</em>}</li>
 *   <li>{@link org.meekmok.Warmok.World#getTerritories <em>Territories</em>}</li>
 *   <li>{@link org.meekmok.Warmok.World#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.meekmok.Warmok.WarmokPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.meekmok.Warmok.WarmokPackage#getWorld_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.World#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

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
	 * @see org.meekmok.Warmok.WarmokPackage#getWorld_Territories()
	 * @model
	 * @generated
	 */
	EList<Territory> getTerritories();

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(GeoPoint)
	 * @see org.meekmok.Warmok.WarmokPackage#getWorld_Dimensions()
	 * @model required="true"
	 * @generated
	 */
	GeoPoint getDimensions();

	/**
	 * Sets the value of the '{@link org.meekmok.Warmok.World#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(GeoPoint value);

} // World
