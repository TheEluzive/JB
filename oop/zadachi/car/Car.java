public class Car implements ICar{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name + " driving...");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopping");
    }
}
