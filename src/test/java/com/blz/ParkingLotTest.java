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

    /**
     * UC1 = Ability To Park vehicle
     * TC1
     */
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        Vehicle vehicle = new Vehicle("alto");
        boolean isParked = parkingLot.vehicleParking(vehicle);
        Assert.assertTrue(isParked);
    }
    /**
     * UC1 = Ability To Park vehicle
     * TC2
     */
    @Test
    public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() {
        Vehicle vehicle = new Vehicle("alto");
        parkingLot.vehicleParking(vehicle);
        boolean isParked = parkingLot.vehicleParking(vehicle);
        Assert.assertFalse(isParked);
    }
    /**
     * UC2 = Ability To unPark vehicle
     * TC3
     */
    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() {
        Vehicle vehicle = new Vehicle("alto");
        parkingLot.vehicleParking(vehicle);
        boolean isUnParked = parkingLot.vehicleUnparking(vehicle);
        Assert.assertTrue(isUnParked);
    }
    /**
     * UC2 = Ability To unPark vehicle
     * TC4
     */
    @Test
    public void givenUnParkedVehicle_WhenTryToUnPark_ShouldReturnFalse() {
        Vehicle vehicle = new Vehicle("alto");
        boolean isUnParked = parkingLot.vehicleUnparking(vehicle);
        Assert.assertFalse(isUnParked);
    }
    /**
     * UC2 = Ability To unPark vehicle
     * TC5
     */
    @Test
    public void givenVehicle_WhenTryToUnParkDifferentVehicle_ShouldReturnFalse() {
        Vehicle vehicle = new Vehicle("alto");
        Vehicle vehicle1 = new Vehicle("alto 80");
        parkingLot.vehicleParking(vehicle);
        boolean isUnParked = parkingLot.vehicleUnparking(vehicle1);
        Assert.assertFalse(isUnParked);
    }

}
