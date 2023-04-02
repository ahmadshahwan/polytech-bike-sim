package fr.polytech.sim.transport;

import fr.polytech.sim.log.ConsoleLogger;
import fr.polytech.sim.log.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Vehicle abstraction.
 */
public abstract class Vehicle implements Mobile {

    private final Logger logger = new ConsoleLogger("Vehicle");
    protected final Set<Mobile> components = new HashSet<>();

    /**
     * Return power to push the vehicle.
     *
     * @return  push power.
     */
    public abstract double getPush();

    /**
     * Calculate and return vehicle speed based on the individual speeds of its
     * components.
     *
     * @return  vehicle speed
     */
    @Override
    public double getSpeed() {
        Iterator<Mobile> iterator = components.iterator();
        double sum = 0;
        int count = 0;
        double lastSpeed = 0;
        boolean inSync = true;
        while (iterator.hasNext()) {
            Mobile component = iterator.next();
            double speed = component.getSpeed();
            if (count != 0) {
                inSync &= speed == lastSpeed;
            }
            lastSpeed = speed;
            sum += speed;
            count++;
        }
        logger.log(inSync ? "Components are in sync" : "⚠ Components are out of sync. ⚠");
        return sum / count;
    }
}
