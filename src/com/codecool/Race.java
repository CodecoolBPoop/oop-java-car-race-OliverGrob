package com.codecool;

import java.util.ArrayList;

public class Race {

    private ArrayList<Car> cars = new ArrayList<>(10);
    private ArrayList<Motorcycle> motorcycles = new ArrayList<>(10);
    private ArrayList<Truck> trucks = new ArrayList<>(10);


    /**
     * Creates 10 cars, 10 trucks and 10 motorcycles.
     */
    public void createVehicles() {
        for (int i = 0; i < 10; i++) {
            cars.add(new Car());
            motorcycles.add(new Motorcycle());
            trucks.add(new Truck());
        }
    }

    /**
     * Simulate the race by
     *    - calling moveForAnHour() on every vehicle 50 times
     *    - setting whether its raining
     */
    public void simulateRace(Race race) {

    }

    /**
     * Prints each vehicle's name, distance traveled ant type.
     */
    public void printRaceResults() {

    }

    /**
     * Decides if there is a broken truck on the track
     *
     * @return : True if there is a broken truck, false if there is not
     */
    public boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
        Race bommBoommWin = new Race();

        bommBoommWin.createVehicles();
        bommBoommWin.simulateRace(bommBoommWin);
        bommBoommWin.printRaceResults();
    }
}
