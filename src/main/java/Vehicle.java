public abstract class Vehicle {
    private Engine engine;
    private int numberOfDoors;
    private String brand;
    private String model;
    private int mileage;
    private double price;
    private Tyre tyre;
    private Gearbox gearbox;

    public Vehicle (Engine engine, int numberOfDoors, String brand, String model, int mileage, double price, Tyre tyre, Gearbox gearbox){
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
        this.tyre = tyre;
        this.gearbox = gearbox;

    }

    public Object getEngineType() {
        return this.engine;
    }
}
