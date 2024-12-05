package org.Parking.Vehicles;

import org.Parking.Slots.Slot;

public abstract class AbstractVehicle {
    private boolean isParked = false;

    public abstract boolean isCanBeParkHere(Slot slot);

    public boolean isParked() {
        return this.isParked;
    }

    public void markAsParked() {
        this.isParked = true;
    }
}
