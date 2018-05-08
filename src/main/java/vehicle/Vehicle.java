package vehicle;

import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

public abstract class Vehicle {

    private String name;
    private double price;
    private String colour;
    private VehicleEngine engine;
    private Tyre tyre;
    private int numberoftyres;

    public Vehicle(String name, double price, String colour, VehicleEngine engine, Tyre tyre, int numberoftyres) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
        this.numberoftyres = numberoftyres;
    }

    public abstract String start();


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public VehicleEngine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public int getNumberoftyres() {
        return numberoftyres;
    }
}
