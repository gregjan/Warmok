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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.meekmok.Games.impl.GameImpl;

import org.meekmok.Warmok.Nation;
import org.meekmok.Warmok.WarmokGame;
import org.meekmok.Warmok.WarmokPackage;
import org.meekmok.Warmok.World;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.impl.WarmokGameImpl#getWorld <em>World</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.WarmokGameImpl#getNations <em>Nations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarmokGameImpl extends GameImpl implements WarmokGame {
	/**
	 * The cached value of the '{@link #getWorld() <em>World</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorld()
	 * @generated
	 * @ordered
	 */
	protected World world;

	/**
	 * The cached value of the '{@link #getNations() <em>Nations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNations()
	 * @generated
	 * @ordered
	 */
	protected EList<Nation> nations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarmokGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarmokPackage.Literals.WARMOK_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World getWorld() {
		if (world != null && world.eIsProxy()) {
			InternalEObject oldWorld = (InternalEObject)world;
			world = (World)eResolveProxy(oldWorld);
			if (world != oldWorld) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.WARMOK_GAME__WORLD, oldWorld, world));
			}
		}
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World basicGetWorld() {
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorld(World newWorld) {
		World oldWorld = world;
		world = newWorld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.WARMOK_GAME__WORLD, oldWorld, world));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nation> getNations() {
		if (nations == null) {
			nations = new EObjectResolvingEList<Nation>(Nation.class, this, WarmokPackage.WARMOK_GAME__NATIONS);
		}
		return nations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WarmokPackage.WARMOK_GAME__WORLD:
				if (resolve) return getWorld();
				return basicGetWorld();
			case WarmokPackage.WARMOK_GAME__NATIONS:
				return getNations();
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
			case WarmokPackage.WARMOK_GAME__WORLD:
				setWorld((World)newValue);
				return;
			case WarmokPackage.WARMOK_GAME__NATIONS:
				getNations().clear();
				getNations().addAll((Collection<? extends Nation>)newValue);
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
			case WarmokPackage.WARMOK_GAME__WORLD:
				setWorld((World)null);
				return;
			case WarmokPackage.WARMOK_GAME__NATIONS:
				getNations().clear();
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
			case WarmokPackage.WARMOK_GAME__WORLD:
				return world != null;
			case WarmokPackage.WARMOK_GAME__NATIONS:
				return nations != null && !nations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WarmokGameImpl
