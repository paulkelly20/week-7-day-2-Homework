import org.junit.Before;
import org.junit.Test;
import vehicle.Van;
import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;
    VehicleEngine engine;
    Tyre tyre;
    Door door;

    @Before
    public void before() {
        engine = new VehicleEngine("Diesel", "500");
        tyre = new Tyre("Continental", 16, "Summer");
        door = new Door("Slide", "White");
        van = new Van("Transit", 15000, "White", engine, tyre, 4, door );

    }

    @Test
    public void getCarName() {
        assertEquals("Transit", van.getName());
    }

    @Test
    public void getCarPrice() {
        assertEquals(15000, van.getPrice(), 0);
    }

    @Test
    public void getCarColour(){
        assertEquals("White", van.getColour());
    }

    @Test
    public void getCarEngineType() {
        assertEquals(engine, van.getEngine());
    }

    @Test
    public void doesCarHaveATyre() {
        assertEquals(tyre, van.getTyre());
    }

    @Test
    public void doesCarHaveADoor() {
        assertEquals(door, van.getDoor());
    }

    @Test
    public void getNumberOfTyres() {
        assertEquals(4, van.getNumberoftyres());
    }

    @Test
    public void testCarCanStart() {
        assertEquals("Turn the key, engine starts!", van.start());
    }
}
