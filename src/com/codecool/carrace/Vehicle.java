package com.codecool.carrace;

public abstract class Vehicle {

    private int normalSpeed;
    private String name;
    private int distanceTraveled = 0;
    private String type;


    public int getNormalSpeed() {
        return this.normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name + " traveled " + this.distanceTraveled + " km (" + this.type + ").";
    }

    /**
     * The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
     * If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.
     *
     * @param race : The race the vehicle is participate
     */
    public abstract void moveForAnHour(Race race);

}
