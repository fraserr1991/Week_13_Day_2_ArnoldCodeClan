public class HybridEngine extends Engine {
    private String fuelType;
    private String chargeType;

    public HybridEngine(String fuelType, String chargeType, int size){
        super(size);
        this.fuelType = fuelType;
        this.chargeType = chargeType;

    }
}
