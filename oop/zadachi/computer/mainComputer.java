public class mainComputer {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung");
        Computer computer = new Computer("MacBook", monitor);
        computer.on();
        computer.off();
    }
}
