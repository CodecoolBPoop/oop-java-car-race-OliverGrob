package com.codecool;

import java.util.Arrays;
import java.util.Random;

public class Car implements Vehicle {

    // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    private int normalSpeed;
    // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
    private String name;
    // holds the current distance traveled.
    private int distanceTraveled = 0;


    public Car() {
        String[] names = {"Meridian", "Heirloom", "Liberty", "Spirit", "Centaur",
                          "Dynamics", "Enigma", "Might", "Gallop", "Barrage",
                          "Inception", "Pulse", "Vision", "Spirit", "Warrior",
                          "Wolf", "Method", "Gorilla", "Universe", "Oli"};
        this.name = names[new Random().nextInt(20)] + " " + names[new Random().nextInt(20)];
        this.normalSpeed = new Random().nextInt(30) + 80;
        System.out.println(name + "'s speed is " + normalSpeed + " km/h!");
    }


    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void moveForAnHour(Race race) {

    }

    /**
     * If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.
     *
     * @return : True if there is a broken truck, false is there is not
     */
    public boolean isThereABrokenTruck() {
        return false;
    }

}
