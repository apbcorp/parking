package org.Parking;

import org.Parking.Exception.ParkingException;
import org.Parking.Vehicles.Car;
import org.Parking.Vehicles.Motorcycle;
import org.Parking.Vehicles.Van;

public class Main {
    public static void main(String[] args) {
        ParkingLot parking = new ParkingLot();
        parking.addFloor(new ParkingFloor(1, 1));
        parking.addFloor(new ParkingFloor(2, 0));
        parking.addFloor(new ParkingFloor(0, 2));

        System.out.println(parking.GetFreeSpaceCount());

        try {
            Car car1 = new Car();
            parking.ParkVehicle(car1);
            System.out.println(parking.GetFreeSpaceCount());

            parking.ParkVehicle(car1);
            System.out.println(parking.GetFreeSpaceCount());

            Van car2 = new Van();
            Car car3 = new Car();

            parking.ParkVehicle(car2);
            parking.ParkVehicle(car3);
        } catch (ParkingException exception) {
            System.out.println("Unexpected exception");
        }

        try {
            Van car4 = new Van();
            parking.ParkVehicle(car4);
        } catch (ParkingException ignored) {

        }

        Motorcycle moto1 = new Motorcycle();
        Motorcycle moto2 = new Motorcycle();
        Motorcycle moto3 = new Motorcycle();
        Motorcycle moto4 = new Motorcycle();

        try {
            parking.ParkVehicle(moto1);
            parking.ParkVehicle(moto2);
            parking.ParkVehicle(moto3);
        } catch (ParkingException exception) {
            System.out.println("Unexpected exception");
        }

        try {
            parking.ParkVehicle(moto4);
        } catch (ParkingException ignored) {

        }

        System.out.println(parking.GetFreeSpaceCount());
    }
}
