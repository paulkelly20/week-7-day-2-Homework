package vehicle;

import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

public class Motorbike extends Vehicle {

    public Motorbike(String name, double price, String colour, VehicleEngine engine, Tyre tyre, int numberoftyres) {
        super(name, price, colour, engine, tyre, numberoftyres);
    }


    public String start() {
        return "Twist handle and press accelerator";
    }
}
