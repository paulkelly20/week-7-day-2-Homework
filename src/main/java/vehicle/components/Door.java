package vehicle.components;

public class Door {

    private String handle;
    private String colour;

    public Door(String handle, String colour) {
        this.handle = handle;
        this.colour = colour;
    }

    public String getHandle() {
        return handle;
    }

    public String getColour() {
        return colour;
    }
}
