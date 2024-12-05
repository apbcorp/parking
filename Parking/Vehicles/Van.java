package org.Parking.Vehicles;

import org.Parking.Slots.CompactSlot;
import org.Parking.Slots.Slot;

public class Van extends AbstractVehicle {
    public boolean isCanBeParkHere(Slot slot)
    {
        return !(slot instanceof CompactSlot);
    }
}
