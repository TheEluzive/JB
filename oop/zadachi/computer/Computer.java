public class Computer implements IComputer {
    private String name;
    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor);
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + monitor);
    }

}
