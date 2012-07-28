package com.meekmok.games;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>Games</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GamesModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NS_URI = "http://www.meekmok.com/Games";

	/**
	 * The {@link ModelFactory} for this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GamesModelFactory MODELFACTORY = new GamesModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE_OPENID_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE_PLAYERS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAYER_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAYER_PROFILE_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME_PLAYERS_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILES_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILES_PROFILES_FEATURE_ID = 0;

	/**
	 * The static member with the instance of this {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GamesModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamesModelPackage initialize() {

		if (isInitialized) {
			return (GamesModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final GamesModelPackage modelPackage = new GamesModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		isInitialized = true;

		// read the model from the ecore file, the EPackage is registered in the EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Profile.class,
				modelPackage.getProfileEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Player.class,
				modelPackage.getPlayerEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Game.class,
				modelPackage.getGameEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Profiles.class,
				modelPackage.getProfilesEClass(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the {@link GamesModelFactory} instance.
	 * @generated
	 */
	@Override
	public GamesModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/** 
	 * Returns the nsUri of the {@link EPackage} managed by this Package instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage 
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/** 
	 * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the name of the ecore file 
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "Games.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Profile</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EClass} '<em><b>Profile</b></em>' 
	 * @generated
	 */
	public EClass getProfileEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PROFILE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Profile.name</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Profile.name</b></em>'.
	 * @generated
	 */
	public EAttribute getProfile_Name() {
		return (EAttribute) getProfileEClass().getEAllStructuralFeatures().get(
				PROFILE_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Profile.openid</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Profile.openid</b></em>'.
	 * @generated
	 */
	public EAttribute getProfile_Openid() {
		return (EAttribute) getProfileEClass().getEAllStructuralFeatures().get(
				PROFILE_OPENID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Profile.players</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Profile.players</b></em>'.
	 * @generated
	 */
	public EReference getProfile_Players() {
		return (EReference) getProfileEClass().getEAllStructuralFeatures().get(
				PROFILE_PLAYERS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Player</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EClass} '<em><b>Player</b></em>' 
	 * @generated
	 */
	public EClass getPlayerEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PLAYER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Player.profile</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Player.profile</b></em>'.
	 * @generated
	 */
	public EReference getPlayer_Profile() {
		return (EReference) getPlayerEClass().getEAllStructuralFeatures().get(
				PLAYER_PROFILE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Game</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EClass} '<em><b>Game</b></em>' 
	 * @generated
	 */
	public EClass getGameEClass() {
		return (EClass) getEPackage().getEClassifiers().get(GAME_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Game.players</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Game.players</b></em>'.
	 * @generated
	 */
	public EReference getGame_Players() {
		return (EReference) getGameEClass().getEAllStructuralFeatures().get(
				GAME_PLAYERS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Profiles</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EClass} '<em><b>Profiles</b></em>' 
	 * @generated
	 */
	public EClass getProfilesEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PROFILES_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Profiles.profiles</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Profiles.profiles</b></em>'.
	 * @generated
	 */
	public EReference getProfiles_Profiles() {
		return (EReference) getProfilesEClass().getEAllStructuralFeatures()
				.get(PROFILES_PROFILES_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case PROFILE_CLASSIFIER_ID:
			return Profile.class;
		case PLAYER_CLASSIFIER_ID:
			return Player.class;
		case GAME_CLASSIFIER_ID:
			return Game.class;
		case PROFILES_CLASSIFIER_ID:
			return Profiles.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
