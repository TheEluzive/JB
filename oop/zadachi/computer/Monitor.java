public class Monitor implements IMonitor{
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
