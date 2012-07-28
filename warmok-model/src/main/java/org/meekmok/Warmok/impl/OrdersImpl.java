/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.meekmok.Warmok.Nation;
import org.meekmok.Warmok.Order;
import org.meekmok.Warmok.Orders;
import org.meekmok.Warmok.WarmokPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.impl.OrdersImpl#getNation <em>Nation</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.OrdersImpl#getMoves <em>Moves</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.OrdersImpl#isCompleted <em>Completed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdersImpl extends EObjectImpl implements Orders {
	/**
	 * The cached value of the '{@link #getNation() <em>Nation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNation()
	 * @generated
	 * @ordered
	 */
	protected Nation nation;

	/**
	 * The cached value of the '{@link #getMoves() <em>Moves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> moves;

	/**
	 * The default value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean completed = COMPLETED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarmokPackage.Literals.ORDERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nation getNation() {
		if (nation != null && nation.eIsProxy()) {
			InternalEObject oldNation = (InternalEObject)nation;
			nation = (Nation)eResolveProxy(oldNation);
			if (nation != oldNation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.ORDERS__NATION, oldNation, nation));
			}
		}
		return nation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nation basicGetNation() {
		return nation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNation(Nation newNation) {
		Nation oldNation = nation;
		nation = newNation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.ORDERS__NATION, oldNation, nation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getMoves() {
		if (moves == null) {
			moves = new EObjectContainmentEList<Order>(Order.class, this, WarmokPackage.ORDERS__MOVES);
		}
		return moves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleted(boolean newCompleted) {
		boolean oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.ORDERS__COMPLETED, oldCompleted, completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarmokPackage.ORDERS__MOVES:
				return ((InternalEList<?>)getMoves()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WarmokPackage.ORDERS__NATION:
				if (resolve) return getNation();
				return basicGetNation();
			case WarmokPackage.ORDERS__MOVES:
				return getMoves();
			case WarmokPackage.ORDERS__COMPLETED:
				return isCompleted();
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
			case WarmokPackage.ORDERS__NATION:
				setNation((Nation)newValue);
				return;
			case WarmokPackage.ORDERS__MOVES:
				getMoves().clear();
				getMoves().addAll((Collection<? extends Order>)newValue);
				return;
			case WarmokPackage.ORDERS__COMPLETED:
				setCompleted((Boolean)newValue);
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
			case WarmokPackage.ORDERS__NATION:
				setNation((Nation)null);
				return;
			case WarmokPackage.ORDERS__MOVES:
				getMoves().clear();
				return;
			case WarmokPackage.ORDERS__COMPLETED:
				setCompleted(COMPLETED_EDEFAULT);
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
			case WarmokPackage.ORDERS__NATION:
				return nation != null;
			case WarmokPackage.ORDERS__MOVES:
				return moves != null && !moves.isEmpty();
			case WarmokPackage.ORDERS__COMPLETED:
				return completed != COMPLETED_EDEFAULT;
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
		result.append(" (completed: ");
		result.append(completed);
		result.append(')');
		return result.toString();
	}

} //OrdersImpl
