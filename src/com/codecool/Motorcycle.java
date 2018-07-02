package com.codecool;

import java.util.Random;

public class Motorcycle implements Vehicle {

    private int normalSpeed = 100;
    private static int nameNumber = 1;
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
        if (Weather.isRaining()) {
            this.normalSpeed -= new Random().nextInt(50) + 5;
        }

        distanceTraveled += this.getNormalSpeed();
        this.setNormalSpeed(100);
    }

}
