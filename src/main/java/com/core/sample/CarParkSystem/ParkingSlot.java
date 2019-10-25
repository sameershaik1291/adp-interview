package com.core.sample.CarParkSystem;

/**
 * @author 
 * 
 * This class represents individual parking slot and stores slot number,type and its availability status
 */
public class ParkingSlot 
{
	@Override
	public String toString() {
		return "ParkingSlot{" +
				"slotNumber=" + slotNumber +
				", availability=" + availability +
				", type='" + type + '\'' +
				'}';
	}

	private int slotNumber;
	private boolean availability;
	private String type;
	
	public ParkingSlot(int slotNumber,String type, boolean availability)
	{
		this.slotNumber = slotNumber;
		this.type=type;		
		this.availability = availability;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
