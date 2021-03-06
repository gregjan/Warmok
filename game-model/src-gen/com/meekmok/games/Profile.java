package com.meekmok.games;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>Profile</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Profile {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String openid = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Player> players = new ArrayList<Player>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Profile#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Profile#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>openid</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>openid</b></em>' feature
	 * @generated
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * Sets the '{@link Profile#getOpenid() <em>openid</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Profile#getOpenid() openid}' feature.
	 * @generated
	 */
	public void setOpenid(String newOpenid) {
		openid = newOpenid;
	}

	/**
	 * Returns the value of '<em><b>players</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>players</b></em>' feature
	 * @generated
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * Adds to the <em>players</em> feature.
	 * 
	 * @generated
	 */
	public void addToPlayers(Player playersValue) {
		if (!players.contains(playersValue)) {
			players.add(playersValue);
		}
	}

	/**
	 * Removes from the <em>players</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromPlayers(Player playersValue) {
		if (players.contains(playersValue)) {
			players.remove(playersValue);
		}
	}

	/**
	 * Clears the <em>players</em> feature.
	 * 
	 * @generated
	 */
	public void clearPlayers() {
		while (!players.isEmpty()) {
			removeFromPlayers(players.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Profile#getPlayers() <em>players</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Profile#getPlayers() players}'
	 *            feature.
	 * @generated
	 */
	public void setPlayers(List<Player> newPlayers) {
		players = newPlayers;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Profile " + " [name: " + getName() + "]" + " [openid: "
				+ getOpenid() + "]";
	}
}
