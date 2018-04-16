package CS201;

public class PrinterClass {
    private String arg;
    public PrinterClass() { System.out.println("no args"); }
    public PrinterClass(String arg) {
        this();
        this.arg = arg;
        System.out.println("arg");
    }
    public void print() {
        System.out.println(arg);
    }
    public static void main(String[] args) {
        new PrinterClass("val").print();
    }
}
