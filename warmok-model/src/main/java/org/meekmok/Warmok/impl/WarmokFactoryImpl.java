/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.meekmok.Warmok.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarmokFactoryImpl extends EFactoryImpl implements WarmokFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WarmokFactory init() {
		try {
			WarmokFactory theWarmokFactory = (WarmokFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.meekmok.com/Warmok"); 
			if (theWarmokFactory != null) {
				return theWarmokFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WarmokFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarmokFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WarmokPackage.WARMOK_GAME: return createWarmokGame();
			case WarmokPackage.ROUND: return createRound();
			case WarmokPackage.ORDERS: return createOrders();
			case WarmokPackage.BUY: return createBuy();
			case WarmokPackage.MOVE: return createMove();
			case WarmokPackage.WORLD: return createWorld();
			case WarmokPackage.NATION: return createNation();
			case WarmokPackage.TERRITORY: return createTerritory();
			case WarmokPackage.UNIT_TYPE: return createUnitType();
			case WarmokPackage.UNIT: return createUnit();
			case WarmokPackage.NATION_TYPE: return createNationType();
			case WarmokPackage.GEO_POINT: return createGeoPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarmokGame createWarmokGame() {
		WarmokGameImpl warmokGame = new WarmokGameImpl();
		return warmokGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round createRound() {
		RoundImpl round = new RoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orders createOrders() {
		OrdersImpl orders = new OrdersImpl();
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buy createBuy() {
		BuyImpl buy = new BuyImpl();
		return buy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World createWorld() {
		WorldImpl world = new WorldImpl();
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nation createNation() {
		NationImpl nation = new NationImpl();
		return nation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Territory createTerritory() {
		TerritoryImpl territory = new TerritoryImpl();
		return territory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationType createNationType() {
		NationTypeImpl nationType = new NationTypeImpl();
		return nationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoPoint createGeoPoint() {
		GeoPointImpl geoPoint = new GeoPointImpl();
		return geoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarmokPackage getWarmokPackage() {
		return (WarmokPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WarmokPackage getPackage() {
		return WarmokPackage.eINSTANCE;
	}

} //WarmokFactoryImpl
