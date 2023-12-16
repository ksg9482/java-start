package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 2보다 작다
        boolean result = 10 < a && a < 20;
        //10 < a < 20은 안됨.
        //10 < 15 에서 true가 나오고 true < 20 형태가 되어서 연산을 할 수 없게된다.
        System.out.println(result);

    }
}
