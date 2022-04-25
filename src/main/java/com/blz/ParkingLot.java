package com.blz;

public class ParkingLot {
    private String vehicle;

    public boolean vehicleParking(String vehicle) {
        if (this.vehicle != null) {
            return false;
        } else {
            this.vehicle = vehicle;
            return true;
        }
    }
}
