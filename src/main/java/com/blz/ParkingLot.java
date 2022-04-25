package com.blz;

public class ParkingLot {
    private Vehicle vehicle;

    public boolean vehicleParking(Vehicle vehicle) {
        if (this.vehicle != null) {
            return false;
        } else {
            this.vehicle = vehicle;
            return true;
        }
    }

    public boolean vehicleUnparking(Vehicle vehicle) {
        if (this.vehicle == null) {
            return false;
        }
        if (this.vehicle.equals(vehicle)) {
            vehicle = null;
            return true;
        }
        return false;
    }

}
