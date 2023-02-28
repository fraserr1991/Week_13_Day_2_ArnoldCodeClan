public abstract class Engine {
    private int size;

    public Engine(int size){
        this.size = size;
    }

    public String start(){
        return "I start";
    }

    public String stop(){
        return "I stop";
    }

    public int getSize() {
        return this.size;
    }
}
