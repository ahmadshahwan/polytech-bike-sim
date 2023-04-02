package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.Vehicle;
import fr.polytech.sim.transport.Wheel;

/**
 * Two-wheel bike.
 */
public class Bike extends Vehicle {

    /**
     * Constructor.
     */
    public Bike() {
        components.add(new Wheel(this));
        components.add(new Wheel(this));
    }

    @Override
    public double getPush() {
        return 25.0;
    }
}
