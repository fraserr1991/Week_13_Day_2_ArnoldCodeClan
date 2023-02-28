import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    private PetrolCar petrolCar;
    private Tyre tyre;
    private Engine engine;
    private Gearbox gearbox;

    @Before
    public void before(){
        tyre = new Tyre(10);
        gearbox = new Gearbox(5, "manual");
        engine = new PetrolEngine("petrol", 50);
        petrolCar = new PetrolCar(engine, 5, "Ford", "Fiesta", 5000, 12000, tyre, gearbox);
    }

    @Test
    public void hasEngine(){
        Engine engine1 = (Engine) petrolCar.getEngineType();
        assertEquals(50, engine1.getSize());
    }

    @Test
    public void canRefuel(){
        assertEquals("I'm full", petrolCar.refuelCar());
    }
}
