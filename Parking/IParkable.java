package org.Parking;

import org.Parking.Exception.NoEmptySpacesException;
import org.Parking.Vehicles.AbstractVehicle;

public interface IParkable {
    public void ParkVehicle(AbstractVehicle vehicle) throws NoEmptySpacesException;
    public int GetFreeSpaceCount();
}
