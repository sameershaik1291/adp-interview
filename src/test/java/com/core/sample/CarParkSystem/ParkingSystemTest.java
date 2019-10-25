package com.core.sample.CarParkSystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ParkingSystemTest {
	private ParkingSystem parkingSystem;
	@Before
	public void setUp() {
		parkingSystem =new ParkingSystem();
	}
	
	@Test
	public void testGetAvailableSlots() {	
		
		List<ParkingSlot> availableSlots =parkingSystem.getAvailableSlots("handicap", 1);
		assertNotNull(availableSlots);
		assertTrue(availableSlots.get(0).getAvailability());
	}
	
	@Test
	public void testCalculateCurrentRevenue() {
		float totalCurrentRevenue =parkingSystem.calculateCurrentRevenue();
		System.out.println(totalCurrentRevenue);
		
	}

}
