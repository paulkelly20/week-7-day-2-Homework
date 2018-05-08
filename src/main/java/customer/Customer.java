package customer;


import vehicle.Rentable;
import vehicle.Vehicle;

public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public boolean canBuyVehicle(Vehicle vehicle){
        if(this.wallet >= vehicle.getPrice()){
            return true;
        }
        else return false;

    }

    public void payForVehicle(Vehicle vehicle){
        if(canBuyVehicle(vehicle)){
            this.wallet -= vehicle.getPrice();
        }

    }

    public boolean canRentVehicle(Rentable vehicle, int days){
        if(this.wallet >= vehicle.rentalPrice(days)){
            return true;
        }
        else return false;

    }

    public void payForRental(Rentable vehicle, int days){
        if(canRentVehicle(vehicle, days)){
            this.wallet -= vehicle.rentalPrice(days);
        }

    }


}


