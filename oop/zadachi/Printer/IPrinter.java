public interface IPrinter {
    void on();
    void off();
    void print(String text, Paper paper);
    void charge(int volume);
}
