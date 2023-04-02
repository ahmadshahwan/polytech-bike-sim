package fr.polytech.sim.transport;

import fr.polytech.sim.cycling.Bike;

/**
 * A wheel that can be used with different vehicle types.
 */
public class Wheel implements Mobile {
    private final Terrain terrain = new Terrain();
    private final Bike bike;


    /**
     * Constructor.
     *
     * @param bike  the object providing push power.
     */
    public Wheel(Bike bike) {
        this.bike = bike;
    }

    @Override
    public double getSpeed() {
        if (this.bike == null) {
            return 0;
        }
        return this.bike.getPush() * this.terrain.getResistanceFactor();
    }
}
