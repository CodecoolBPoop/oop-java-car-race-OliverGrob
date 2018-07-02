package com.codecool;

import java.util.Random;

public class Car implements Vehicle {

    private int normalSpeed;
    private String name;
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

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            distanceTraveled += 75;
            return;
        }

        distanceTraveled += this.getNormalSpeed();
    }

}
