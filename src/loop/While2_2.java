package loop;

public class While2_2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int endNum = 3;

        while (i <= endNum) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
