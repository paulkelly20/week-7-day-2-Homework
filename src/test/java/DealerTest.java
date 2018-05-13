import customer.Customer;
import dealer.Dealer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Rentable;
import vehicle.Van;
import vehicle.components.Door;
import vehicle.components.Tyre;
import vehicle.components.VehicleEngine;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Customer customer1;
    Customer customer2;
    Car car;
    VehicleEngine engine;
    Tyre tyre;
    Door door;
    Rentable van;

    @Before
    public void before() {
        dealer = new Dealer("Ewen's of Cornhill", 100000.00);
        engine = new VehicleEngine("Petrol", "1000", 100);
        tyre = new Tyre("Goodyear", 18, "Winter", 20);
        door = new Door("Pull", "Blue", 300);
        customer1 = new Customer("Sarah", 30000);
        customer2 = new Customer("Paul", 5000);
        car = new Car("Clio", 10000, "Blue", engine, tyre, 4, door);
        van = new Van("Transit", 1000, "Red", engine, tyre, 4, door);

    }

    @Test
    public void countVehiclesForSale() {
        assertEquals(0, dealer.getVehicleCount());
    }

    @Test
    public void countVehiclesForRent() {
        assertEquals(0, dealer.getRentableCount());
    }

    @Test
    public void dealerBuysVehicle() {
        dealer.dealerBuysVehicle(car);
        assertEquals(1, dealer.getVehicleCount());
    }

    @Test
    public void sellTakesVehicleFromStock() {
        dealer.dealerBuysVehicle(car);
        dealer.sell(car, customer1);
        assertEquals(0, dealer.getVehicleCount());
        assertEquals(102000, dealer.getTill(), 0.01);

    }

    @Test
    public void testVehicleForRent() {
        dealer.dealerAddsVehicleToRentalList(van);
        dealer.rent(van, customer1, 5);
        assertEquals(0, dealer.getRentableCount());
        assertEquals(100050, dealer.getTill(), 0);
    }

    @Test
    public void getWholeSalePrice() {
        assertEquals(8000, dealer.dealerWholesalePrice(car), 0);
    }

    @Test
    public void dealerBuysCarTillGoesDown() {
        dealer.dealerBuysVehicle(car);
        assertEquals(92000, dealer.getTill(), 0);
    }

    @Test
    public void addPartToDealerStock() {
        dealer.addPartsToStock(engine);
        assertEquals(1, dealer.getPartsCount());
    }

    @Test
    public void customersCarIsRepaired() {
        dealer.addPartsToStock(engine);
        dealer.repair(engine, customer1, 1);
        assertEquals(100100, dealer.getTill(), 0);
        assertEquals(0, dealer.getPartsCount());
    }
}
