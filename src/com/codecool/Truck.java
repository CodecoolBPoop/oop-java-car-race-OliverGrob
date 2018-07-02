package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft = 0;


    public Truck() {
        this.setName(Integer.toString(new Random().nextInt(1000)));
        this.setNormalSpeed(100);
        this.setType("Truck");
        System.out.println("Truck number " + this.getName() + " created!");
    }


    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public boolean isBrokenDown() {
        return this.breakdownTurnsLeft != 0;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (this.getBreakdownTurnsLeft() == 0) {
            this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
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
