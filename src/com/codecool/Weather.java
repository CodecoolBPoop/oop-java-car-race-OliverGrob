package com.codecool;

import java.util.Random;

public class Weather {

    private static boolean raining;

    /**
     * 30% chance of rain.
     */
    public static void setRaining() {
        int chanceOfRain = new Random().nextInt(10);
        raining = chanceOfRain < 3;
    }

    /**
     * Returns whether it is raining currently or not.
     *
     * @return : True if it's raining, false if not
     */
    public static boolean isRaining() {
        return raining;
    }
}
