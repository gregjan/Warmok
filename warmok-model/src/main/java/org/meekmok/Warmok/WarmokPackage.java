/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.meekmok.Warmok;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.meekmok.Games.GamesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.meekmok.Warmok.WarmokFactory
 * @model kind="package"
 * @generated
 */
public interface WarmokPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Warmok";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.meekmok.com/Warmok";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wrmk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WarmokPackage eINSTANCE = org.meekmok.Warmok.impl.WarmokPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.WarmokGameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.WarmokGameImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getWarmokGame()
	 * @generated
	 */
	int WARMOK_GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARMOK_GAME__PLAYERS = GamesPackage.GAME__PLAYERS;

	/**
	 * The feature id for the '<em><b>World</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARMOK_GAME__WORLD = GamesPackage.GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARMOK_GAME__NATIONS = GamesPackage.GAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARMOK_GAME_FEATURE_COUNT = GamesPackage.GAME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.RoundImpl <em>Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.RoundImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getRound()
	 * @generated
	 */
	int ROUND = 1;

	/**
	 * The number of structural features of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.OrdersImpl <em>Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.OrdersImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getOrders()
	 * @generated
	 */
	int ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Nation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__NATION = 0;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__MOVES = 1;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__COMPLETED = 2;

	/**
	 * The number of structural features of the '<em>Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.OrderImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.BuyImpl <em>Buy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.BuyImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getBuy()
	 * @generated
	 */
	int BUY = 4;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__DESTINATION = ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__TYPE = ORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__QUANTITY = ORDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Buy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_FEATURE_COUNT = ORDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.MoveImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 5;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DESTINATION = ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__UNITS = ORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ORDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.WorldImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Territories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__TERRITORIES = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__DIMENSIONS = 2;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.NationImpl <em>Nation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.NationImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getNation()
	 * @generated
	 */
	int NATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Treasury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__TREASURY = 2;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__LEADER = 4;

	/**
	 * The feature id for the '<em><b>Start Territory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__START_TERRITORY = 5;

	/**
	 * The feature id for the '<em><b>Territories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__TERRITORIES = 6;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__UNITS = 7;

	/**
	 * The number of structural features of the '<em>Nation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.TerritoryImpl <em>Territory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.TerritoryImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getTerritory()
	 * @generated
	 */
	int TERRITORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__CENTER = 1;

	/**
	 * The feature id for the '<em><b>Adjacent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__ADJACENT_TO = 2;

	/**
	 * The feature id for the '<em><b>Habitable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__HABITABLE = 3;

	/**
	 * The number of structural features of the '<em>Territory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.UnitTypeImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__MOVEMENT = 1;

	/**
	 * The feature id for the '<em><b>Fight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__FIGHT = 2;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.UnitImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;

	/**
	 * The feature id for the '<em><b>Nation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NATION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.NationTypeImpl <em>Nation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.NationTypeImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getNationType()
	 * @generated
	 */
	int NATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.meekmok.Warmok.impl.GeoPointImpl <em>Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.meekmok.Warmok.impl.GeoPointImpl
	 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getGeoPoint()
	 * @generated
	 */
	int GEO_POINT = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.WarmokGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see org.meekmok.Warmok.WarmokGame
	 * @generated
	 */
	EClass getWarmokGame();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.WarmokGame#getWorld <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>World</em>'.
	 * @see org.meekmok.Warmok.WarmokGame#getWorld()
	 * @see #getWarmokGame()
	 * @generated
	 */
	EReference getWarmokGame_World();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.WarmokGame#getNations <em>Nations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nations</em>'.
	 * @see org.meekmok.Warmok.WarmokGame#getNations()
	 * @see #getWarmokGame()
	 * @generated
	 */
	EReference getWarmokGame_Nations();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Round <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round</em>'.
	 * @see org.meekmok.Warmok.Round
	 * @generated
	 */
	EClass getRound();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orders</em>'.
	 * @see org.meekmok.Warmok.Orders
	 * @generated
	 */
	EClass getOrders();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Orders#getNation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nation</em>'.
	 * @see org.meekmok.Warmok.Orders#getNation()
	 * @see #getOrders()
	 * @generated
	 */
	EReference getOrders_Nation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.meekmok.Warmok.Orders#getMoves <em>Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moves</em>'.
	 * @see org.meekmok.Warmok.Orders#getMoves()
	 * @see #getOrders()
	 * @generated
	 */
	EReference getOrders_Moves();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Orders#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see org.meekmok.Warmok.Orders#isCompleted()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Completed();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.meekmok.Warmok.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Buy <em>Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buy</em>'.
	 * @see org.meekmok.Warmok.Buy
	 * @generated
	 */
	EClass getBuy();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Buy#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.meekmok.Warmok.Buy#getDestination()
	 * @see #getBuy()
	 * @generated
	 */
	EReference getBuy_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Buy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.meekmok.Warmok.Buy#getType()
	 * @see #getBuy()
	 * @generated
	 */
	EReference getBuy_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Buy#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.meekmok.Warmok.Buy#getQuantity()
	 * @see #getBuy()
	 * @generated
	 */
	EAttribute getBuy_Quantity();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see org.meekmok.Warmok.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Move#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.meekmok.Warmok.Move#getDestination()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Destination();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.Move#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see org.meekmok.Warmok.Move#getUnits()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Units();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see org.meekmok.Warmok.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.World#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.meekmok.Warmok.World#getImage()
	 * @see #getWorld()
	 * @generated
	 */
	EAttribute getWorld_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.World#getTerritories <em>Territories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Territories</em>'.
	 * @see org.meekmok.Warmok.World#getTerritories()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Territories();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.World#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions</em>'.
	 * @see org.meekmok.Warmok.World#getDimensions()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Dimensions();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation</em>'.
	 * @see org.meekmok.Warmok.Nation
	 * @generated
	 */
	EClass getNation();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Nation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.meekmok.Warmok.Nation#getName()
	 * @see #getNation()
	 * @generated
	 */
	EAttribute getNation_Name();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Nation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.meekmok.Warmok.Nation#getType()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Nation#getTreasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treasury</em>'.
	 * @see org.meekmok.Warmok.Nation#getTreasury()
	 * @see #getNation()
	 * @generated
	 */
	EAttribute getNation_Treasury();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Nation#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see org.meekmok.Warmok.Nation#getPlayer()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Player();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Nation#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader</em>'.
	 * @see org.meekmok.Warmok.Nation#getLeader()
	 * @see #getNation()
	 * @generated
	 */
	EAttribute getNation_Leader();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Nation#getStartTerritory <em>Start Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Territory</em>'.
	 * @see org.meekmok.Warmok.Nation#getStartTerritory()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_StartTerritory();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.Nation#getTerritories <em>Territories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Territories</em>'.
	 * @see org.meekmok.Warmok.Nation#getTerritories()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Territories();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.Nation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see org.meekmok.Warmok.Nation#getUnits()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Units();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Territory <em>Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Territory</em>'.
	 * @see org.meekmok.Warmok.Territory
	 * @generated
	 */
	EClass getTerritory();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Territory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.meekmok.Warmok.Territory#getName()
	 * @see #getTerritory()
	 * @generated
	 */
	EAttribute getTerritory_Name();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Territory#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center</em>'.
	 * @see org.meekmok.Warmok.Territory#getCenter()
	 * @see #getTerritory()
	 * @generated
	 */
	EReference getTerritory_Center();

	/**
	 * Returns the meta object for the reference list '{@link org.meekmok.Warmok.Territory#getAdjacentTo <em>Adjacent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adjacent To</em>'.
	 * @see org.meekmok.Warmok.Territory#getAdjacentTo()
	 * @see #getTerritory()
	 * @generated
	 */
	EReference getTerritory_AdjacentTo();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.Territory#isHabitable <em>Habitable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Habitable</em>'.
	 * @see org.meekmok.Warmok.Territory#isHabitable()
	 * @see #getTerritory()
	 * @generated
	 */
	EAttribute getTerritory_Habitable();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see org.meekmok.Warmok.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.UnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.meekmok.Warmok.UnitType#getName()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.UnitType#getMovement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement</em>'.
	 * @see org.meekmok.Warmok.UnitType#getMovement()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Movement();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.UnitType#getFight <em>Fight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fight</em>'.
	 * @see org.meekmok.Warmok.UnitType#getFight()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Fight();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.meekmok.Warmok.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Unit#getNation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nation</em>'.
	 * @see org.meekmok.Warmok.Unit#getNation()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Nation();

	/**
	 * Returns the meta object for the reference '{@link org.meekmok.Warmok.Unit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.meekmok.Warmok.Unit#getType()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Type();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.NationType <em>Nation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation Type</em>'.
	 * @see org.meekmok.Warmok.NationType
	 * @generated
	 */
	EClass getNationType();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.NationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.meekmok.Warmok.NationType#getName()
	 * @see #getNationType()
	 * @generated
	 */
	EAttribute getNationType_Name();

	/**
	 * Returns the meta object for class '{@link org.meekmok.Warmok.GeoPoint <em>Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Point</em>'.
	 * @see org.meekmok.Warmok.GeoPoint
	 * @generated
	 */
	EClass getGeoPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.GeoPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.meekmok.Warmok.GeoPoint#getX()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.meekmok.Warmok.GeoPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.meekmok.Warmok.GeoPoint#getY()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WarmokFactory getWarmokFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.WarmokGameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.WarmokGameImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getWarmokGame()
		 * @generated
		 */
		EClass WARMOK_GAME = eINSTANCE.getWarmokGame();

		/**
		 * The meta object literal for the '<em><b>World</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARMOK_GAME__WORLD = eINSTANCE.getWarmokGame_World();

		/**
		 * The meta object literal for the '<em><b>Nations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARMOK_GAME__NATIONS = eINSTANCE.getWarmokGame_Nations();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.RoundImpl <em>Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.RoundImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getRound()
		 * @generated
		 */
		EClass ROUND = eINSTANCE.getRound();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.OrdersImpl <em>Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.OrdersImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getOrders()
		 * @generated
		 */
		EClass ORDERS = eINSTANCE.getOrders();

		/**
		 * The meta object literal for the '<em><b>Nation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS__NATION = eINSTANCE.getOrders_Nation();

		/**
		 * The meta object literal for the '<em><b>Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS__MOVES = eINSTANCE.getOrders_Moves();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__COMPLETED = eINSTANCE.getOrders_Completed();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.OrderImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.BuyImpl <em>Buy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.BuyImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getBuy()
		 * @generated
		 */
		EClass BUY = eINSTANCE.getBuy();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUY__DESTINATION = eINSTANCE.getBuy_Destination();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUY__TYPE = eINSTANCE.getBuy_Type();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUY__QUANTITY = eINSTANCE.getBuy_Quantity();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.MoveImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__DESTINATION = eINSTANCE.getMove_Destination();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__UNITS = eINSTANCE.getMove_Units();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.WorldImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD__IMAGE = eINSTANCE.getWorld_Image();

		/**
		 * The meta object literal for the '<em><b>Territories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__TERRITORIES = eINSTANCE.getWorld_Territories();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__DIMENSIONS = eINSTANCE.getWorld_Dimensions();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.NationImpl <em>Nation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.NationImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getNation()
		 * @generated
		 */
		EClass NATION = eINSTANCE.getNation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION__NAME = eINSTANCE.getNation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__TYPE = eINSTANCE.getNation_Type();

		/**
		 * The meta object literal for the '<em><b>Treasury</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION__TREASURY = eINSTANCE.getNation_Treasury();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__PLAYER = eINSTANCE.getNation_Player();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION__LEADER = eINSTANCE.getNation_Leader();

		/**
		 * The meta object literal for the '<em><b>Start Territory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__START_TERRITORY = eINSTANCE.getNation_StartTerritory();

		/**
		 * The meta object literal for the '<em><b>Territories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__TERRITORIES = eINSTANCE.getNation_Territories();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__UNITS = eINSTANCE.getNation_Units();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.TerritoryImpl <em>Territory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.TerritoryImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getTerritory()
		 * @generated
		 */
		EClass TERRITORY = eINSTANCE.getTerritory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERRITORY__NAME = eINSTANCE.getTerritory_Name();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERRITORY__CENTER = eINSTANCE.getTerritory_Center();

		/**
		 * The meta object literal for the '<em><b>Adjacent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERRITORY__ADJACENT_TO = eINSTANCE.getTerritory_AdjacentTo();

		/**
		 * The meta object literal for the '<em><b>Habitable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERRITORY__HABITABLE = eINSTANCE.getTerritory_Habitable();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.UnitTypeImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__NAME = eINSTANCE.getUnitType_Name();

		/**
		 * The meta object literal for the '<em><b>Movement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__MOVEMENT = eINSTANCE.getUnitType_Movement();

		/**
		 * The meta object literal for the '<em><b>Fight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__FIGHT = eINSTANCE.getUnitType_Fight();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.UnitImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Nation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__NATION = eINSTANCE.getUnit_Nation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__TYPE = eINSTANCE.getUnit_Type();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.NationTypeImpl <em>Nation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.NationTypeImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getNationType()
		 * @generated
		 */
		EClass NATION_TYPE = eINSTANCE.getNationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_TYPE__NAME = eINSTANCE.getNationType_Name();

		/**
		 * The meta object literal for the '{@link org.meekmok.Warmok.impl.GeoPointImpl <em>Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.meekmok.Warmok.impl.GeoPointImpl
		 * @see org.meekmok.Warmok.impl.WarmokPackageImpl#getGeoPoint()
		 * @generated
		 */
		EClass GEO_POINT = eINSTANCE.getGeoPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__X = eINSTANCE.getGeoPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__Y = eINSTANCE.getGeoPoint_Y();

	}

} //WarmokPackage
