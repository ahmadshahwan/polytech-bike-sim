package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.FileLogger;
import fr.polytech.sim.log.Logger;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = new FileLogger("BikeSimulator");

    public void run() {
        Bike bike = new Bike();
        this.logger.log("Bike's speed %.2f Km/h.", bike.getSpeed());
    }
}
