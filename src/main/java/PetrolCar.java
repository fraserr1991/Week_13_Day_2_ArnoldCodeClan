public class PetrolCar extends Vehicle implements IPurchaseable{

    public PetrolCar (Engine engine, int numberOfDoors, String brand, String model, int mileage, double price, Tyre tyre, Gearbox gearbox){
        super (engine, numberOfDoors, brand, model, mileage, price, tyre, gearbox);
    }

    public String refuelCar() {
        return "I'm full";
    }

    public void purchase(){

    }


}
