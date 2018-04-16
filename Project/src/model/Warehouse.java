package model;
import java.awt.Point;
import java.util.ArrayList;
public class Warehouse {

	public Point robotCoordinates;
	public Point storageCoordinates;
	public Point chargingCoordintates;
	public Point packingCoordinates;
	
	private ArrayList<Robot> robotList;
	private ArrayList<ChargingPod> chargeList;
	private ArrayList<StorageShelf> storageList;
	private ArrayList<PackingStation> packingList;

	
	public Warehouse(){
		/*
		this.chargingCoordintates=chargingCoordintates;
		this.robotCoordinates=robotCoordinates;
		this.storageCoordinates=storageCoordinates;
		this.packingCoordinates=packingCoordinates;
		*/
		robotList = new ArrayList<Robot>();
		chargeList = new ArrayList<ChargingPod>();
		storageList = new ArrayList<StorageShelf>();
		packingList = new ArrayList<PackingStation>();
	}
	
	public void addRobot(int x, int y, int batteryLevel, int chargeRate) {
		Robot robot = new Robot();
		robotList.add(robot);
		for(int i = 0; i < robotList.size(); i++) {
			robotList.get(i).updateBattery(batteryLevel);
			System.out.println(robotList.get(i).getID()); //delete this manual test after
		}
		
		
		ChargingPod chargePod = new ChargingPod();
		chargeList.add(chargePod);
		for(int i = 0; i < chargeList.size(); i++) {
			chargeList.get(i).updateChargeRate(chargeRate);
		}
	}	
	
	public void addStorage(int x, int y) {
		StorageShelf storage = new StorageShelf();
		storageList.add(storage);
		for(int i = 0; i < storageList.size(); i++) {
			System.out.println(storageList.get(i).getID()); //delete this manual test after
		}
	}
	
	public void addPacking(int x, int y) {
		PackingStation packing = new PackingStation();
		packingList.add(packing);
	}
	
	public void removeRobot() {
		if((robotList.size()-1)>0) {
			robotList.remove(robotList.size()-1);
		}
		else {
			robotList.remove(robotList.get(0));
		}
	}
	
	public void removeCharge() {
		if((chargeList.size()-1)>0) { 
			chargeList.remove(chargeList.size()-1);
		}
		else {
			chargeList.remove(chargeList.get(0));
		}
	}
	
	public void removeStorage() {
		storageList.remove(storageList.size()-1);
	}
	
	public void removePacking() {
		packingList.remove(packingList.size()-1);
	}
	
	public void removeAll() {	
		for(int i = 0; i < robotList.size(); i++) {
			robotList.remove(i);
		}
		for(int i = 0; i < chargeList.size(); i++) {
			chargeList.remove(i);
		}
		for(int i = 0; i < storageList.size(); i++) {
			storageList.remove(i);
		}
		for(int i = 0; i < packingList.size(); i++) {
			packingList.remove(i);
		}
		if(!robotList.isEmpty()) {
			robotList.get(0).resetID(); //may have to move up
			robotList.remove(0);
		}
		if(!chargeList.isEmpty()) {
			chargeList.get(0).resetID();
			chargeList.remove(0);
		}
		if(!storageList.isEmpty()) {
			storageList.get(0).resetID();
			storageList.remove(0);
		}
		if(!packingList.isEmpty()) {
			packingList.get(0).resetID();
			packingList.remove(0);
		}
	}

}
