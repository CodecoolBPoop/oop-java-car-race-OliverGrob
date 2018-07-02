package com.codecool.carrace;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private static int nameNumber = 0;


    public Motorcycle() {
        nameNumber++;
        this.setName("Motorcycle " + nameNumber);
        this.setNormalSpeed(100);
        this.setType("Motorcycle");
        System.out.println(this.getName() + " is created!");
    }


    @Override
    public void moveForAnHour(Race race) {
        if (Weather.isRaining()) {
            this.setNormalSpeed(this.getNormalSpeed() - (new Random().nextInt(50) + 5));
        }

        this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
        this.setNormalSpeed(100);
    }

}
