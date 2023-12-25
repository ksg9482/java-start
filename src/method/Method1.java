package method;

public class Method1 {
    public static void main(String[] args) {

        int sum1 = add(5, 10);
        System.out.println(sum1);

        int sum2 = add(10, 30);
        System.out.println(sum2);
    }

    public static int add(int x, int y) {
        System.out.println(x + " + " + y);
        int sum = x + y;
        return sum;
    }
}
