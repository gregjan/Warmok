package com.meekmok.games;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: Games.
 * It contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GamesModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass}
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GamesModelPackage.PROFILE_CLASSIFIER_ID:
			return createProfile();
		case GamesModelPackage.PLAYER_CLASSIFIER_ID:
			return createPlayer();
		case GamesModelPackage.GAME_CLASSIFIER_ID:
			return createGame();
		case GamesModelPackage.PROFILES_CLASSIFIER_ID:
			return createProfiles();
		}
		throw new IllegalArgumentException("The EClass '" + eClass.getName()
				+ "' is not a valid EClass for this EPackage");
	}

	/**
	 * Wraps an object in a {@link ModelObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case GamesModelPackage.PROFILE_CLASSIFIER_ID:
			modelObject = new ProfileModelObject();
			break;
		case GamesModelPackage.PLAYER_CLASSIFIER_ID:
			modelObject = new PlayerModelObject();
			break;
		case GamesModelPackage.GAME_CLASSIFIER_ID:
			modelObject = new GameModelObject();
			break;
		case GamesModelPackage.PROFILES_CLASSIFIER_ID:
			modelObject = new ProfilesModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *          the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map
	 * entry is null then a new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *          the feature map feature of the object
	 * @param adaptee
	 *          the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Profile
	 * @generated
	 */
	public Profile createProfile() {
		return new Profile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Player
	 * @generated
	 */
	public Player createPlayer() {
		return new Player();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Game
	 * @generated
	 */
	public Game createGame() {
		return new Game();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Profiles
	 * @generated
	 */
	public Profiles createProfiles() {
		return new Profiles();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eDataType the {@link EDataType} defining the type
	 * @param value the object to convert, if the value is null then null is returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage");
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eDataType the {@link EDataType} defining the type
	 * @param value the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage.");
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Profile</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class ProfileModelObject<E extends Profile> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return GamesModelPackage.INSTANCE.getProfileEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return GamesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PROFILE_NAME_FEATURE_ID:
				return getTarget().getName();
			case GamesModelPackage.PROFILE_OPENID_FEATURE_ID:
				return getTarget().getOpenid();
			case GamesModelPackage.PROFILE_PLAYERS_FEATURE_ID:
				return getTarget().getPlayers();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PROFILE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case GamesModelPackage.PROFILE_OPENID_FEATURE_ID:
				getTarget().setOpenid((String) value);
				return;
			case GamesModelPackage.PROFILE_PLAYERS_FEATURE_ID:
				getTarget().setPlayers((List<Player>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.PROFILE_PLAYERS_FEATURE_ID:
				getTarget().getPlayers().add((Player) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.PROFILE_PLAYERS_FEATURE_ID:
				getTarget().getPlayers().remove((Player) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Player</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class PlayerModelObject<E extends Player> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return GamesModelPackage.INSTANCE.getPlayerEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return GamesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PLAYER_PROFILE_FEATURE_ID:
				return getTarget().getProfile();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PLAYER_PROFILE_FEATURE_ID:
				getTarget().setProfile((Profile) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Game</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class GameModelObject<E extends Game> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return GamesModelPackage.INSTANCE.getGameEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return GamesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.GAME_PLAYERS_FEATURE_ID:
				return getTarget().getPlayers();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.GAME_PLAYERS_FEATURE_ID:
				getTarget().setPlayers((List<Player>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.GAME_PLAYERS_FEATURE_ID:
				getTarget().getPlayers().add((Player) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.GAME_PLAYERS_FEATURE_ID:
				getTarget().getPlayers().remove((Player) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Profiles</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class ProfilesModelObject<E extends Profiles> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return GamesModelPackage.INSTANCE.getProfilesEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return GamesModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PROFILES_PROFILES_FEATURE_ID:
				return getTarget().getProfiles();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case GamesModelPackage.PROFILES_PROFILES_FEATURE_ID:
				getTarget().setProfiles((List<Profile>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.PROFILES_PROFILES_FEATURE_ID:
				getTarget().getProfiles().add((Profile) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case GamesModelPackage.PROFILES_PROFILES_FEATURE_ID:
				getTarget().getProfiles().remove((Profile) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

}
