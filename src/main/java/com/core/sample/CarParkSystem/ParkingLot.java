package com.core.sample.CarParkSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 
 * 
 * This class has  all parking slots initialised
 */
public class ParkingLot 
{
	
	/**
	 * This method returns map of all the parking slots 
	 * 
	 * @return map of the slots in the parking lot
	 */
	public Map<Integer, List<ParkingSlot>> getParkingSlots()
	{

		Map<Integer, List<ParkingSlot>> allSlots = new HashMap<Integer, List<ParkingSlot>>();
		List<ParkingSlot> parkingSlots1 = new ArrayList<ParkingSlot>();

		parkingSlots1.add(new ParkingSlot(1, "handicap", true));
		parkingSlots1.add(new ParkingSlot(2, "standard", true));
		parkingSlots1.add(new ParkingSlot(3, "handicap", false));

		allSlots.put(1, parkingSlots1);

		List<ParkingSlot> parkingSlots2 = new ArrayList<ParkingSlot>();

		parkingSlots2.add(new ParkingSlot(4, "standard", false));
		parkingSlots2.add(new ParkingSlot(5, "standard", true));
		parkingSlots2.add(new ParkingSlot(6, "handicap", false));

		allSlots.put(2, parkingSlots2);

		List<ParkingSlot> parkingSlots3 = new ArrayList<ParkingSlot>();

		parkingSlots3.add(new ParkingSlot(4, "standard", true));
		parkingSlots3.add(new ParkingSlot(5, "handicap", true));
		parkingSlots3.add(new ParkingSlot(6, "handicap", false));

		allSlots.put(3, parkingSlots3);

		return allSlots;
	}
	
}
