package vehicle.components;

public class Tyre {

    private String brand;
    private int size;
    private String treadtype;
    private double price;

    public Tyre(String brand, int size, String treadtype, double price) {
        this.brand = brand;
        this.size = size;
        this.treadtype = treadtype;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSize() {
        return this.size;
    }

    public String getTreadtype() {
        return this.treadtype;
    }

    public double getPrice() {
        return price;
    }
}
