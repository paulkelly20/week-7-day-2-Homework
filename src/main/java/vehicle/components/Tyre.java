package vehicle.components;

public class Tyre {

    private String brand;
    private int size;
    private String Treadtype;

    public Tyre(String brand, int size, String treadtype) {
        this.brand = brand;
        this.size = size;
        Treadtype = treadtype;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getTreadtype() {
        return Treadtype;
    }
}
