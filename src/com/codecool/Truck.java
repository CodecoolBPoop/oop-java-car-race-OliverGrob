package com.codecool;

import java.util.Random;

public class Truck implements Vehicle {

    // speed: 100km/h. 5% chance of breaking down for 2 hours.
    private int normalSpeed = 100;
    private String name = Integer.toString(new Random().nextInt(1000));
    private int breakdownTurnsLeft = 0;
    private int distanceTraveled = 0;


    public Truck() {
        System.out.println("Truck number " + this.name + " created!");
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

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (this.getBreakdownTurnsLeft() == 0) {
            this.distanceTraveled += this.getNormalSpeed();
            int breakdownChance = new Random().nextInt(100);

            if (breakdownChance < 5) {
                this.setBreakdownTurnsLeft(2);
            }
        }
        else {
            this.breakdownTurnsLeft--;
        }
    }

}
