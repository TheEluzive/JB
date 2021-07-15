public class mainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Paper a4 = new Paper(10, "a4");
        Paper a5 = new Paper(12, "a5");
        printer.on();
        printer.charge(20);
        printer.print("0123456781", a4);
        printer.print("0123456782", a5);
        printer.print("0123456783", a4);
        printer.charge(5);
        printer.off();
        printer.on();
        printer.print("0123456783", a4);
        printer.charge(5);
        printer.print("0123456783", a4);
        printer.off();
    }
}
