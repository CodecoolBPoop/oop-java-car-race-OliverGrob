package com.codecool;

public interface Vehicle {

    /**
     * The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
     * If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.
     *
     * @param race : The race the vehicle is participate
     */
    public void moveForAnHour(Race race);
}
