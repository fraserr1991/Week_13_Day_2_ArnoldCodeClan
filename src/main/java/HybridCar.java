public class HybridCar extends Vehicle implements IPurchaseable{

    public HybridCar (Engine engine, int numberOfDoors, String brand, String model, int mileage, double price, Tyre tyre, Gearbox gearbox){
        super (engine, numberOfDoors, brand, model, mileage, price, tyre, gearbox);
    }

    public String refuelCar() {
        return "I'm full";
    }

    public String rechargeCar(){
        return "YUM YUM ELECTRICITY!";
    }

    public void purchase(){

    }


}
