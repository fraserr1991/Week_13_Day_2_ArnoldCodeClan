import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;
    Tyre tyre;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        tyre = new Tyre(10);
        gearbox = new Gearbox(5, "manual");
        engine = new HybridEngine("Hybrid", "Electric",100);

        hybridCar = new HybridCar(engine, 5, "Ford", "Hydresta", 50000, 4000, tyre, gearbox);
    }

    @Test
    public void hasEngine(){
        Engine engine1 = (Engine) hybridCar.getEngineType();
        assertEquals(100, engine1.getSize());
    }

    @Test
    public void canRefuel(){
        assertEquals("I'm full", hybridCar.refuelCar());
    }

    @Test
    public void canCharge(){
        assertEquals("YUM YUM ELECTRICITY!", hybridCar.rechargeCar());
    }
}

