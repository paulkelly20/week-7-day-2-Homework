package vehicle.components;



public class VehicleEngine {

    private String type;
    private String power;

    public VehicleEngine(String type, String power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }
}
