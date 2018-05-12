import org.junit.Before;
import org.junit.Test;
import vehicle.Motorbike;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {


        Motorbike bike;
        VehicleEngine engine;
        Tyre tyre;


        @Before
        public void before() {
            engine = new VehicleEngine("Petrol", "2000" ,1000);
            tyre = new Tyre("Michelin", 15, "Summer", 100);
            bike = new Motorbike ("Harley Davidson", 20000, "Black", engine, tyre, 2);

        }

        @Test
        public void getCarName() {
            assertEquals("Harley Davidson", bike.getName());
        }

        @Test
        public void getCarPrice() {
            assertEquals(20000, bike.getPrice(), 0);
        }

        @Test
        public void getCarColour(){
            assertEquals("Black", bike.getColour());
        }

        @Test
        public void getCarEngineType() {
            assertEquals(engine, bike.getEngine());
        }

        @Test
        public void doesCarHaveATyre() {
            assertEquals(tyre, bike.getTyre());
        }


        @Test
        public void getNumberOfTyres() {
            assertEquals(2, bike.getNumberoftyres());
        }

        @Test
        public void testCarCanStart() {
            assertEquals("Twist handle and press accelerator", bike.start());
        }
}
