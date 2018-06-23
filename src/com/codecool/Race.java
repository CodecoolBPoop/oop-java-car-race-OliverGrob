package com.codecool;

public class Race {

    /**
     * Creates 10 cars, 10 trucks and 10 motorcycles.
     */
    public static void createVehicles() {

    }

    /**
     * Simulate the race by
     *    - calling moveForAnHour() on every vehicle 50 times
     *    - setting whether its raining
     */
    public static void simulateRace() {

    }

    /**
     * Prints each vehicle's name, distance traveled ant type.
     */
    public static void printRaceResults() {

    }

    /**
     * Decides if there is a broken truck on the track
     *
     * @return : True if there is a broken truck, false if there is not
     */
    public static boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = new Car(Integer.toString(i));
            Motorcycle motorcycle = new Motorcycle();
            Truck truck = new Truck();
        }
    }
}
