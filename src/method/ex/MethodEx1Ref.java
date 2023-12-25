package method.ex;
public class MethodEx1Ref {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = sumValue(a, b, c);
        double average = averageValue(sum, 3);
        System.out.println("평균값: " + average);
        int x = 15;
        int y = 25;
        int z = 35;
        sum = sumValue(x, y, z);
        average = averageValue(sum, 3);
        System.out.println("평균값: " + average);
    }

    public static int sumValue(int a, int b, int c) {
        return a + b + c;
    }

    public static double averageValue(int sum, int count) {
        return (double) sum / count;
    }
}