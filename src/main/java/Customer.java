import java.util.ArrayList;

public class Customer {
    private double wallet;
    private ArrayList<IPurchaseable> collection;

    public Customer(double wallet){
        this.wallet = wallet;
        this.collection = new ArrayList<>();
    }

    public void addCollection(IPurchaseable vehicle) {
        this.collection.add(vehicle);
    }

    public int numberOfCarsInCollection() {
        return this.collection.size();
    }
}
