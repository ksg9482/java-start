package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number1 = 1.5;

//        printNumber(number1);//타입 안 맞음. 큰 범위를 작은 범위에 넣을 수 없다.
        printNumber((int) number1); //명시적 형변환.
    }

    public static void printNumber(int n) {
        System.out.println(n);
    }
}
