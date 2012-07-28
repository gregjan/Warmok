/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.meekmok.Warmok.UnitType;
import org.meekmok.Warmok.WarmokPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.impl.UnitTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.UnitTypeImpl#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.UnitTypeImpl#getFight <em>Fight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitTypeImpl extends EObjectImpl implements UnitType {
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
	 * The default value of the '{@link #getMovement() <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovement()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVEMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMovement() <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovement()
	 * @generated
	 * @ordered
	 */
	protected int movement = MOVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFight() <em>Fight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFight()
	 * @generated
	 * @ordered
	 */
	protected static final int FIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFight() <em>Fight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFight()
	 * @generated
	 * @ordered
	 */
	protected int fight = FIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarmokPackage.Literals.UNIT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.UNIT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMovement() {
		return movement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovement(int newMovement) {
		int oldMovement = movement;
		movement = newMovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.UNIT_TYPE__MOVEMENT, oldMovement, movement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFight() {
		return fight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFight(int newFight) {
		int oldFight = fight;
		fight = newFight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.UNIT_TYPE__FIGHT, oldFight, fight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WarmokPackage.UNIT_TYPE__NAME:
				return getName();
			case WarmokPackage.UNIT_TYPE__MOVEMENT:
				return getMovement();
			case WarmokPackage.UNIT_TYPE__FIGHT:
				return getFight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WarmokPackage.UNIT_TYPE__NAME:
				setName((String)newValue);
				return;
			case WarmokPackage.UNIT_TYPE__MOVEMENT:
				setMovement((Integer)newValue);
				return;
			case WarmokPackage.UNIT_TYPE__FIGHT:
				setFight((Integer)newValue);
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
			case WarmokPackage.UNIT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WarmokPackage.UNIT_TYPE__MOVEMENT:
				setMovement(MOVEMENT_EDEFAULT);
				return;
			case WarmokPackage.UNIT_TYPE__FIGHT:
				setFight(FIGHT_EDEFAULT);
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
			case WarmokPackage.UNIT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WarmokPackage.UNIT_TYPE__MOVEMENT:
				return movement != MOVEMENT_EDEFAULT;
			case WarmokPackage.UNIT_TYPE__FIGHT:
				return fight != FIGHT_EDEFAULT;
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
		result.append(", movement: ");
		result.append(movement);
		result.append(", fight: ");
		result.append(fight);
		result.append(')');
		return result.toString();
	}

} //UnitTypeImpl
