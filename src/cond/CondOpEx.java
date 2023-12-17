package cond;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int bigger = (a < b) ? b : a;

        System.out.println(bigger);
    }
}
