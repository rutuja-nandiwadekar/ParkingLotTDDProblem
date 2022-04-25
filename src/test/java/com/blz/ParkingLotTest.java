package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
    ParkingLot parkingLot = null;

    @Before
    public void setUp() throws Exception {
        parkingLot = new ParkingLot();
    }

    //UC1 = Ability To Park vehicle
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        boolean isParked = parkingLot.vehicleParking("alto");
        Assert.assertTrue(isParked);
    }
}
