package model;

import java.awt.Point;

/**
 * This class contains the implementation of the Charging Pod methods.
 * 
 * @author Miraj Shah, Devin Shingadia, Jacob Williams, Mohammed Hamza Zaman,
 *         Vivek Bhukhan, Christos Dolopikos.
 *         
 * @version 1.0
 *
 */

public class ChargingPod implements Entity {

	/**
	 * Determines the speed at which the battery of a robot is charged.
	 * 
	 * @see #charge
	 */
	private int chargeRate;
	
	/**
	 * The unique identifier of each charging pod.
	 * 
	 * @see #getID, #generateID
	 */
	private String uid;
	
	/**
	 * The Point coordinates where the Charging Pod is placed on the grid.
	 * 
	 * @see #chargingPod #getChargingCoordinates #getChargingX #getChargingY
	 */
	private Point chargingCoordinates;
		
	  /**
	  * Charging Pod Constructor.
	  * 
	  * @param x <code>int</code> {@link chargingCoordinates} used to initialise a new Point coordinate for a Charging Pod.
	  * @param y <code>int</code> {@link chargingCoordinates} used to initialise a new Point coordinate for a Charging Pod.
	  */
	public ChargingPod(int x, int y) {
		chargingCoordinates = new Point(x, y);	
	}
	
	/**
	 * Gets the X and Y coordinates of the charging Pod.
	 * 
	 * @return Returns a <code>Point</code>. The coordinate value.
	 */
	public Point getChargingCoordinates() {
		return chargingCoordinates;
	}
	
	/**
	 * Accesses the X coordinate of the charging Pod.
	 * 
	 * @return Returns a <code>Point</code>. The X coordinate value.
	 */
	public double getChargingX(){
		return chargingCoordinates.getX();
	}
	
	/**
	 * Accesses the Y coordinate of the charging Pod.
	 * 
	 * @return Returns a <code>Point</code>. The Y coordinate value.
	 */
	public double getChargingY(){
		return chargingCoordinates.getY();
	}
	
	/**
	 * Updates the chargeRate of the Charging Pod
	 * 
	 * @param chargeRate {@link chargeRate}. The <code>int</code> value assigned to link the chargeRate parameter to the chargeRate field.
	 */
	public void updateChargeRate(int chargeRate) {
		this.chargeRate = chargeRate;
	}
	
	/**
	 * Gets the charge rate set by the {@link #updateChargeRate(int)} method.
	 * 	
	 * @return Returns {@link #updateChargeRate(int)} an <code>int</code> value. Representing the charge rate.
	 */
	public int getChargeRate() {
		return chargeRate;
	}
	
	@Override
	public void generateID(int id) {
			int num = id++;
			uid = "c" + num;
	}
	
	@Override
	public String getID() {
		return uid;
	}
	
	@Override
	public void setId(String newUid) {
		uid = newUid;
	}
}
