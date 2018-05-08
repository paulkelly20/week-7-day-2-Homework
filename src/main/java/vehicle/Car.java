package vehicle;

import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

public class Car extends Vehicle implements Rentable{

    private Door door;

    public Car(String name, double price, String colour, VehicleEngine engine, Tyre tyre, int numberoftyres, Door door) {
        super(name, price, colour, engine, tyre, numberoftyres);
        this.door = door;
    }


    public String start() {
        return "Vroom vrooom";
    }

    public Door getDoor() {
        return door;
    }


    public double rentalPrice( int rentaldays) {

        double rentalprice = (this.getPrice() / 100) * rentaldays;
        return  rentalprice;
    }
}
