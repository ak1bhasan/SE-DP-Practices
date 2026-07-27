class Printer{
    void printData(String  text) {
        System.out.println(text);
    }

    void printData(int  number) {
        System.out.println(number);
    }
}

public class YouDo05 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printData("Hello");
        printer.printData(5);

    }
}
