package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("main");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("start");
    }

    public static void printFooter() {
        System.out.println("end");
    }
}
