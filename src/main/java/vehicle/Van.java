package vehicle;

import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

public class Van extends Vehicle implements Rentable {

    private Door door;


    public Van(String name, double price, String colour, VehicleEngine engine, Tyre tyre, int numberoftyres, Door door) {
        super(name, price, colour, engine, tyre, numberoftyres);
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public String start() {
        return "Turn the key, engine starts!";
    }

    public double rentalPrice( int rentaldays) {
        double rentalprice = (this.getPrice() / 100) * rentaldays;
        return  rentalprice;
    }
}
