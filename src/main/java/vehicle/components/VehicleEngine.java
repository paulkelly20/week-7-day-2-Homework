package vehicle.components;



public class VehicleEngine {

    private String type;
    private String power;
    private double price;

    public VehicleEngine(String type, String power, double price) {
        this.type = type;
        this.power = power;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }
}

