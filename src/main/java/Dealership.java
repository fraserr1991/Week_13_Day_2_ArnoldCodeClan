import java.util.ArrayList;

public class Dealership {
    private ArrayList<IPurchaseable> stock;
    private double till;

    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public void addStock(IPurchaseable vehicle) {
        this.stock.add(vehicle);
    }

    public int numberOfCarsInStock() {
        return stock.size();
    }

//    public void sell(IPurchaseable petrolCar, Customer customer) {
//
//    }
}
