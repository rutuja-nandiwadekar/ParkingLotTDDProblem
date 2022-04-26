package com.blz;

public class ParkingLot {
    private Vehicle vehicle;
    /**
     * @Purpose : To park the vehicle
     * @Param : vehicle
     * @Return : Returns boolean value true or false
     */
    public boolean vehicleParking(Vehicle vehicle) {
        if (this.vehicle != null) {
            return false;
        } else {
            this.vehicle = vehicle;
            return true;
        }
    }
    /**
     * @Purpose : To unPark the vehicle
     * @Param : vehicle
     * @Return : Returns boolean value true or false
     */
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
