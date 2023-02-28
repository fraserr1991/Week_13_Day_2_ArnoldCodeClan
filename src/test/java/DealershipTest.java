import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Customer customer;
    private PetrolCar petrolCar;
    private Tyre tyre;
    private Engine engine;
    private Gearbox gearbox;

    @Before
    public void before(){
        dealership = new Dealership(10000.00);
        tyre = new Tyre(10);
        gearbox = new Gearbox(5, "manual");
        engine = new PetrolEngine("petrol", 50);
        petrolCar = new PetrolCar(engine, 5, "Ford", "Fiesta", 5000, 12000, tyre, gearbox);
        customer = new Customer(12500);
    }

    @Test
    public void canAddStock(){
        dealership.addStock(petrolCar);
        assertEquals(1, dealership.numberOfCarsInStock());
    }

//    @Test
//    public void canSellVehicle(){
//        dealership.addStock(petrolCar);
//        dealership.addStock(petrolCar);
//        dealership.sell(petrolCar, customer);
//        assertEquals(1,dealership.numberOfCarsInStock());
//        assertEquals(1, customer.numberOfCarsInCollection());
//
//    }
}
