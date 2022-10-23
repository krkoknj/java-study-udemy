package encapsulation;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(5);
        System.out.println("printer = " + printer);
        printer.turnOnDouble();
        printer.print(5);
        System.out.println("printer = " + printer);
        printer.toFillInToner(101);
        System.out.println(printer);
    }
}
