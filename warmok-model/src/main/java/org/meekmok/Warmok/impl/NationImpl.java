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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.meekmok.Games.Player;

import org.meekmok.Warmok.Nation;
import org.meekmok.Warmok.NationType;
import org.meekmok.Warmok.Territory;
import org.meekmok.Warmok.Unit;
import org.meekmok.Warmok.WarmokPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getTreasury <em>Treasury</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getStartTerritory <em>Start Territory</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getTerritories <em>Territories</em>}</li>
 *   <li>{@link org.meekmok.Warmok.impl.NationImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NationImpl extends EObjectImpl implements Nation {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NationType type;

	/**
	 * The default value of the '{@link #getTreasury() <em>Treasury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreasury()
	 * @generated
	 * @ordered
	 */
	protected static final int TREASURY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTreasury() <em>Treasury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreasury()
	 * @generated
	 * @ordered
	 */
	protected int treasury = TREASURY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The default value of the '{@link #getLeader() <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected String leader = LEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartTerritory() <em>Start Territory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTerritory()
	 * @generated
	 * @ordered
	 */
	protected Territory startTerritory;

	/**
	 * The cached value of the '{@link #getTerritories() <em>Territories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerritories()
	 * @generated
	 * @ordered
	 */
	protected EList<Territory> territories;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarmokPackage.Literals.NATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (NationType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.NATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NationType newType) {
		NationType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTreasury() {
		return treasury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreasury(int newTreasury) {
		int oldTreasury = treasury;
		treasury = newTreasury;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__TREASURY, oldTreasury, treasury));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.NATION__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(String newLeader) {
		String oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__LEADER, oldLeader, leader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Territory getStartTerritory() {
		if (startTerritory != null && startTerritory.eIsProxy()) {
			InternalEObject oldStartTerritory = (InternalEObject)startTerritory;
			startTerritory = (Territory)eResolveProxy(oldStartTerritory);
			if (startTerritory != oldStartTerritory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarmokPackage.NATION__START_TERRITORY, oldStartTerritory, startTerritory));
			}
		}
		return startTerritory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Territory basicGetStartTerritory() {
		return startTerritory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTerritory(Territory newStartTerritory) {
		Territory oldStartTerritory = startTerritory;
		startTerritory = newStartTerritory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarmokPackage.NATION__START_TERRITORY, oldStartTerritory, startTerritory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Territory> getTerritories() {
		if (territories == null) {
			territories = new EObjectResolvingEList<Territory>(Territory.class, this, WarmokPackage.NATION__TERRITORIES);
		}
		return territories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectWithInverseResolvingEList<Unit>(Unit.class, this, WarmokPackage.NATION__UNITS, WarmokPackage.UNIT__NATION);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarmokPackage.NATION__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarmokPackage.NATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
			case WarmokPackage.NATION__NAME:
				return getName();
			case WarmokPackage.NATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WarmokPackage.NATION__TREASURY:
				return getTreasury();
			case WarmokPackage.NATION__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case WarmokPackage.NATION__LEADER:
				return getLeader();
			case WarmokPackage.NATION__START_TERRITORY:
				if (resolve) return getStartTerritory();
				return basicGetStartTerritory();
			case WarmokPackage.NATION__TERRITORIES:
				return getTerritories();
			case WarmokPackage.NATION__UNITS:
				return getUnits();
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
			case WarmokPackage.NATION__NAME:
				setName((String)newValue);
				return;
			case WarmokPackage.NATION__TYPE:
				setType((NationType)newValue);
				return;
			case WarmokPackage.NATION__TREASURY:
				setTreasury((Integer)newValue);
				return;
			case WarmokPackage.NATION__PLAYER:
				setPlayer((Player)newValue);
				return;
			case WarmokPackage.NATION__LEADER:
				setLeader((String)newValue);
				return;
			case WarmokPackage.NATION__START_TERRITORY:
				setStartTerritory((Territory)newValue);
				return;
			case WarmokPackage.NATION__TERRITORIES:
				getTerritories().clear();
				getTerritories().addAll((Collection<? extends Territory>)newValue);
				return;
			case WarmokPackage.NATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
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
			case WarmokPackage.NATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WarmokPackage.NATION__TYPE:
				setType((NationType)null);
				return;
			case WarmokPackage.NATION__TREASURY:
				setTreasury(TREASURY_EDEFAULT);
				return;
			case WarmokPackage.NATION__PLAYER:
				setPlayer((Player)null);
				return;
			case WarmokPackage.NATION__LEADER:
				setLeader(LEADER_EDEFAULT);
				return;
			case WarmokPackage.NATION__START_TERRITORY:
				setStartTerritory((Territory)null);
				return;
			case WarmokPackage.NATION__TERRITORIES:
				getTerritories().clear();
				return;
			case WarmokPackage.NATION__UNITS:
				getUnits().clear();
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
			case WarmokPackage.NATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WarmokPackage.NATION__TYPE:
				return type != null;
			case WarmokPackage.NATION__TREASURY:
				return treasury != TREASURY_EDEFAULT;
			case WarmokPackage.NATION__PLAYER:
				return player != null;
			case WarmokPackage.NATION__LEADER:
				return LEADER_EDEFAULT == null ? leader != null : !LEADER_EDEFAULT.equals(leader);
			case WarmokPackage.NATION__START_TERRITORY:
				return startTerritory != null;
			case WarmokPackage.NATION__TERRITORIES:
				return territories != null && !territories.isEmpty();
			case WarmokPackage.NATION__UNITS:
				return units != null && !units.isEmpty();
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
		result.append(", treasury: ");
		result.append(treasury);
		result.append(", leader: ");
		result.append(leader);
		result.append(')');
		return result.toString();
	}

} //NationImpl
