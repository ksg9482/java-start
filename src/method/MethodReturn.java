package method;

public class MethodReturn {
    public static void main(String[] args) {
        boolean a = odd(3);
        System.out.println(a);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
