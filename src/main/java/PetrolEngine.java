public class PetrolEngine extends Engine {
    private String fuelType;

    public PetrolEngine(String fuelType, int size){
        super(size);
        this.fuelType = fuelType;
    }
}
