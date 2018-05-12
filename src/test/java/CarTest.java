import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    VehicleEngine  engine;
    Tyre tyre;
    Door door;

    @Before
    public void before() {
        engine = new VehicleEngine("Petrol", "1000", 1000);
        tyre = new Tyre("Goodyear", 18, "Winter", 20);
        door = new Door("Pull", "Blue", 100);
        car = new Car("Clio", 10000, "Blue", engine, tyre, 4, door );

    }

    @Test
    public void getCarName() {
        assertEquals("Clio", car.getName());
    }

    @Test
    public void getCarPrice() {
        assertEquals(10000, car.getPrice(), 0);
    }

    @Test
    public void getCarColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void getCarEngineType() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void doesCarHaveATyre() {
        assertEquals(tyre, car.getTyre());
    }

    @Test
    public void doesCarHaveADoor() {
        assertEquals(door, car.getDoor());
    }

    @Test
    public void getNumberOfTyres() {
        assertEquals(4, car.getNumberoftyres());
    }

    @Test
    public void testCarCanStart() {
        assertEquals("Vroom vrooom", car.start());
    }

    @Test
    public void getRentalPrice() {
        assertEquals(100, car.rentalPrice(1), 0);
    }


}
