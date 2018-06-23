package com.codecool;

import java.util.Random;

public class Motorcycle implements Vehicle {

    // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
    private int normalSpeed = 100;
    // The number of the instance created. Used for its name.
    private static int nameNumber = 0;
    // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
    private String name = "Motorcycle " + nameNumber;
    private int distanceTraveled = 0;


    public Motorcycle() {
        nameNumber++;
        System.out.println(this.name + " is created!");
    }


    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public int getNameNumber() {
        return nameNumber;
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
     * If it is raining, the speed of the motorcycle is reduced by 5-50 randomly
     *
     * @return : True if it is raining, false if not
     */
    public boolean isItRaining() {
        return false;
    }

}
