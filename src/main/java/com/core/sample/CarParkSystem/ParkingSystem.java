package com.core.sample.CarParkSystem;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingSystem {
	
	
	/**
	 * This method returns all available slots for given type and number 
	 * 
	 * @return list of available slots
	 */
	public List<ParkingSlot> getAvailableSlots(String type,int number){
		
		ParkingLot lot=new ParkingLot();
		Map<Integer,List<ParkingSlot>> allSlots=lot.getParkingSlots();
		
		List<ParkingSlot> parkingSlots= allSlots.get(number);
		List<ParkingSlot> finalSlots =parkingSlots.stream().filter(parkingSlot -> type.equalsIgnoreCase(parkingSlot.getType())&&parkingSlot.getAvailability())
        .collect(Collectors.toList());
		
		return finalSlots;
		
	}	

	/**
	 * This method calculates current revenue.
	 * 
	 * @return current Revenue
	 */
	public int calculateCurrentRevenue() {
		int costForOneHour = 2;
		ParkingLot lot = new ParkingLot();
		Map<Integer, List<ParkingSlot>> allSlots = lot.getParkingSlots();
		List<ParkingSlot> totalParkingSlots = allSlots.values().stream().flatMap(Collection::stream)
				.collect(Collectors.toList());

		List<ParkingSlot> occupiedSlots = totalParkingSlots.stream().filter(slot -> !slot.getAvailability())
				.collect(Collectors.toList());

		int totalOccupiedSlots = occupiedSlots.size();

		int oneHourParkingCost = (int) (totalOccupiedSlots * (10 / 100.0f)) * costForOneHour;
		int twoHourParkingCost = (int) (totalOccupiedSlots * (90 / 100.0f)) * costForOneHour * costForOneHour;

		return oneHourParkingCost + twoHourParkingCost;

	}	

}
