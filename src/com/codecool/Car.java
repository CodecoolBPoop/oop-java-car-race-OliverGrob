package com.codecool;

import java.util.Random;

public class Car extends Vehicle {

    public Car() {
        String[] names = {"Meridian", "Heirloom", "Liberty", "Spirit", "Centaur",
                          "Dynamics", "Enigma", "Might", "Gallop", "Barrage",
                          "Inception", "Pulse", "Vision", "Spirit", "Warrior",
                          "Wolf", "Method", "Gorilla", "Universe", "Oli"};
        this.setName(names[new Random().nextInt(20)] + " " + names[new Random().nextInt(20)]);
        this.setNormalSpeed(new Random().nextInt(30) + 80);
        this.setType("Car");
        System.out.println(this.getName() + "'s speed is " + this.getNormalSpeed() + " km/h!");
    }


    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            this.setDistanceTraveled(this.getDistanceTraveled() + 75);
            return;
        }

        this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
    }

}
