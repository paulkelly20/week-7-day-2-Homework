package vehicle.components;

import customer.Customer;
import vehicle.Sellable;

public class Door implements Sellable {

    private String handle;
    private String colour;
    private double price;

    public Door(String handle, String colour, double price) {
        this.handle = handle;
        this.colour = colour;
        this.price = price;
    }

    public String getHandle() {
        return handle;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double sell(int quantity) {
        return this.price * quantity;
    }
}
