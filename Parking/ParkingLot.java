package org.Parking;

import org.Parking.Exception.NoEmptySpacesException;
import org.Parking.Vehicles.AbstractVehicle;

import java.util.ArrayList;

public class ParkingLot implements IParkable {
    private ArrayList<ParkingFloor> floors;

    public ParkingLot() {
        this.floors = new ArrayList<ParkingFloor>();
    }

    public void addFloor(ParkingFloor floor) {
        this.floors.add(floor);
    }

    public void ParkVehicle(AbstractVehicle vehicle) throws NoEmptySpacesException {
        for (ParkingFloor floor : this.floors) {
            try {
                floor.ParkVehicle(vehicle);

                return;
            } catch (NoEmptySpacesException ignored) {

            }
        }

        throw new NoEmptySpacesException();
    }

    public int GetFreeSpaceCount() {
        int result = 0;
        for (ParkingFloor floor : this.floors) {
            result += floor.GetFreeSpaceCount();
        }

        return result;
    }
}
