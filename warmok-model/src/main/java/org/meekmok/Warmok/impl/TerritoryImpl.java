/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.meekmok.Warmok.GeoPoint;
import org.meekmok.Warmok.Territory;
import org.meekmok.Warmok.WarmokPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Territory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.impl.TerritoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.TerritoryImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.TerritoryImpl#getAdjacentTo <em>Adjacent To</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.TerritoryImpl#isHabitable <em>Habitable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerritoryImpl extends EObjectImpl implements Territory {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected GeoPoint center;

	/**
	 * The cached value of the '{@link #getAdjacentTo() <em>Adjacent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Territory> adjacentTo;

	/**
	 * The default value of the '{@link #isHabitable() <em>Habitable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHabitable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HABITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHabitable() <em>Habitable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHabitable()
	 * @generated
	 * @ordered
	 */
	protected boolean habitable = HABITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerritoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarmokPackage.Literals.TERRITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.TERRITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoPoint getCenter() {
		if (center != null && center.eIsProxy()) {
			InternalEObject oldCenter = (InternalEObject)center;
			center = (GeoPoint)eResolveProxy(oldCenter);
			if (center != oldCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.TERRITORY__CENTER, oldCenter, center));
			}
		}
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoPoint basicGetCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(GeoPoint newCenter) {
		GeoPoint oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.TERRITORY__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Territory> getAdjacentTo() {
		if (adjacentTo == null) {
			adjacentTo = new EObjectResolvingEList<Territory>(Territory.class, this, WarmokPackage.TERRITORY__ADJACENT_TO);
		}
		return adjacentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHabitable() {
		return habitable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHabitable(boolean newHabitable) {
		boolean oldHabitable = habitable;
		habitable = newHabitable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.TERRITORY__HABITABLE, oldHabitable, habitable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WarmokPackage.TERRITORY__NAME:
				return getName();
			case WarmokPackage.TERRITORY__CENTER:
				if (resolve) return getCenter();
				return basicGetCenter();
			case WarmokPackage.TERRITORY__ADJACENT_TO:
				return getAdjacentTo();
			case WarmokPackage.TERRITORY__HABITABLE:
				return isHabitable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WarmokPackage.TERRITORY__NAME:
				setName((String)newValue);
				return;
			case WarmokPackage.TERRITORY__CENTER:
				setCenter((GeoPoint)newValue);
				return;
			case WarmokPackage.TERRITORY__ADJACENT_TO:
				getAdjacentTo().clear();
				getAdjacentTo().addAll((Collection<? extends Territory>)newValue);
				return;
			case WarmokPackage.TERRITORY__HABITABLE:
				setHabitable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WarmokPackage.TERRITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WarmokPackage.TERRITORY__CENTER:
				setCenter((GeoPoint)null);
				return;
			case WarmokPackage.TERRITORY__ADJACENT_TO:
				getAdjacentTo().clear();
				return;
			case WarmokPackage.TERRITORY__HABITABLE:
				setHabitable(HABITABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WarmokPackage.TERRITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WarmokPackage.TERRITORY__CENTER:
				return center != null;
			case WarmokPackage.TERRITORY__ADJACENT_TO:
				return adjacentTo != null && !adjacentTo.isEmpty();
			case WarmokPackage.TERRITORY__HABITABLE:
				return habitable != HABITABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", habitable: ");
		result.append(habitable);
		result.append(')');
		return result.toString();
	}

} //TerritoryImpl
