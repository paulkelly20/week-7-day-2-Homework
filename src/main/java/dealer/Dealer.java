package dealer;

import customer.Customer;
import vehicle.Motorbike;
import vehicle.Rentable;
import vehicle.Sellable;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealer {

    private String name;
    private double till;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Rentable> rentables;
    private ArrayList<Sellable> parts;

    public Dealer(String name, double till) {
        this.name = name;
        this.till = till;
        this.vehicles = new ArrayList<>();
        this.rentables = new ArrayList<>();
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPartsCount() {
        return parts.size();
    }

    public double getTill() {
        return till;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public int getRentableCount() {
        return rentables.size();
    }

    public void dealerBuysVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
        this.till -= dealerWholesalePrice(vehicle);
    }

    public void dealerAddsVehicleToRentalList(Rentable vehicle){
        this.rentables.add(vehicle);

    }

    public void addPartsToStock(Sellable part){
        this.parts.add(part);
        this.till -= (part.getPrice() * 0.8);
    }

    public double dealerWholesalePrice(Vehicle vehicle){
        return vehicle.getPrice() *0.8;
    }

    public void sell(Vehicle vehicle, Customer customer){
        this.vehicles.remove(vehicle);
        customer.payForVehicle(vehicle);
        this.till += vehicle.getPrice();

    }

    public void rent(Rentable vehicle, Customer customer, int days){
        this.rentables.remove(vehicle);
        customer.payForRental(vehicle, days);
        this.till += vehicle.rentalPrice(days);
    }

//    public void repair(Sellable part, Customer customer, int quantity){
//        this.rentables.remove(vehicle);
//        customer.payForRental(vehicle, days);
//        this.till += vehicle.rentalPrice(days);
//    }




}


