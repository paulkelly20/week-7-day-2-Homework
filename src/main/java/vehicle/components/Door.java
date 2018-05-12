package vehicle.components;

public class Door {

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
}
