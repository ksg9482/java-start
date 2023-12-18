package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                break;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
