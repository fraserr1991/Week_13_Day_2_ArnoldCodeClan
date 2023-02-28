import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    PetrolCar petrolCar;
    Tyre tyre;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        customer = new Customer(12500.00);
        tyre = new Tyre(10);
        gearbox = new Gearbox(5, "manual");
        engine = new PetrolEngine("petrol", 50);
        petrolCar = new PetrolCar(engine, 5, "Ford", "Fiesta", 5000, 12000, tyre, gearbox);

    }

    @Test
    public void canAddStock(){
        customer.addCollection(petrolCar);
        assertEquals(1, customer.numberOfCarsInCollection());
    }


}
