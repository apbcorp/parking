package org.Parking;

import org.Parking.Exception.CarIsParkedException;
import org.Parking.Exception.NoEmptySpacesException;
import org.Parking.Exception.ParkingException;
import org.Parking.Slots.CompactSlot;
import org.Parking.Slots.Slot;
import org.Parking.Vehicles.AbstractVehicle;

import java.util.ArrayList;

public class ParkingFloor implements IParkable{
    private ArrayList<Slot> slots;

    public ParkingFloor(int fullSpaces, int compactSpaces) {
        this.slots = new ArrayList<Slot>();

        for (int i = 0; i < fullSpaces; i++) {
            this.slots.add(new Slot());
        }

        for (int i = 0; i < compactSpaces; i++) {
            this.slots.add(new CompactSlot());
        }
    }

    public void ParkVehicle(AbstractVehicle vehicle) throws NoEmptySpacesException {
        for (Slot slot : this.slots) {
            try {
                slot.ParkVehicle(vehicle);

                return;
            } catch (CarIsParkedException exception) {
                return;
            } catch (ParkingException ignored) {

            }
        }

        throw new NoEmptySpacesException();
    }

    public int GetFreeSpaceCount() {
        int result = 0;
        for (Slot slot : this.slots) {
            result += slot.isEmpty() ? 1 : 0;
        }

        return result;
    }
}
