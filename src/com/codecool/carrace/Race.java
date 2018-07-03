package com.codecool.carrace;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Vehicle> vehicles = new ArrayList<>(30);

    /**
     * Creates 10 cars, 10 trucks and 10 motorcycles.
     */
    public void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }

    /**
     * Simulate the race by
     *    - calling moveForAnHour() on every vehicle 50 times
     *    - setting whether its raining
     */
    public void simulateRace(Race race) {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle: vehicles) {
                vehicle.moveForAnHour(race);
            }
        }
    }

    /**
     * Prints each vehicle's name, distance traveled ant type.
     */
    public void printRaceResults() {
        System.out.println("\n----------   Results   ----------");
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getRaceResult());
        }
    }

    /**
     * Decides if there is a broken truck on the track
     *
     * @return : True if there is a broken truck, false if there is not
     */
    public boolean isThereABrokenTruck() {
        for (Vehicle vehicle: vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBrokenDown()) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        race.createVehicles();
        race.simulateRace(race);
        race.printRaceResults();
    }

}
