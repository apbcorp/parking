package org.Parking.Slots;

import org.Parking.Exception.CarIsParkedException;
import org.Parking.Exception.InvalidVehicleException;
import org.Parking.Exception.NoEmptySpacesException;
import org.Parking.Exception.ParkingException;
import org.Parking.Vehicles.AbstractVehicle;

public class Slot {
    private boolean isEmpty = true;

    public void ParkVehicle(AbstractVehicle vehicle) throws ParkingException {
        if (vehicle.isParked()) throw new CarIsParkedException();
        if (!this.isEmpty) throw new NoEmptySpacesException();
        if (!vehicle.isCanBeParkHere(this)) throw new InvalidVehicleException();

        this.isEmpty = false;
        vehicle.markAsParked();
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }
}
