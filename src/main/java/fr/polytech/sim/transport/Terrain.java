package fr.polytech.sim.transport;

import java.util.Random;

/**
 * Terrain features.
 */
public class Terrain {
    private final double resistanceFactor = new Random().nextDouble();

    /**
     * How much would the terrain resist the mobility of an object, such as a
     * wheel.
     *
     * @return terrain resistance factor
     */
    public double getResistanceFactor() {
        return resistanceFactor;
    }
}
