import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Vehicle;
import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    Car car;
    VehicleEngine engine;
    Tyre tyre;
    Door door;

    @Before
    public void before() {

        engine = new VehicleEngine("Petrol", "1000", 1000);
        tyre = new Tyre("Goodyear", 18, "Winter", 20);
        door = new Door("Pull", "Blue", 100);
        customer1 = new Customer("Sarah", 30000);
        customer2 = new Customer("Paul", 5000);
        car = new Car("Clio", 10000, "Blue", engine, tyre, 4, door);
    }

    @Test
    public void customerCanBuyCarCanAfford() {
        assertEquals(true, customer1.canBuyVehicle(car));
    }

    @Test
    public void customerCannotBuyCarCannotAfford() {
        assertEquals(false, customer2.canBuyVehicle(car));
    }

    @Test
    public void customerPaysForVehicle() {
        customer1.payForVehicle(car);
        assertEquals(20000, customer1.getWallet(), 0.01);
    }

    @Test
    public void canRentVehicle() {
        assertEquals(true, customer1.canRentVehicle(car, 1));
    }

    @Test
    public void canRentVehicleReturnFalse() {
        assertEquals(false, customer1.canRentVehicle(car, 100000));
    }

    @Test
    public void canRentVehicleReduceWallet() {
        customer1.payForRental(car, 1);
        assertEquals(29900, customer1.getWallet(), 0);
    }

    @Test
    public void canCustomerAffordRepair() {
        assertEquals(true, customer1.canAffordRepair(engine, 1));
    }
}