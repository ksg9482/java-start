package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 증가시키고 그 결과를 b에 대입. 2가 된 후 b에 2가 대입됨
        System.out.println("a =" + a + ", b = " + b);

        //후위 증감 연산사
        a = 1;
        b = 0;

        b = a++; //a의 현재값을 b에 먼저 대입하고, 그 후 a 값을 증가시킨다. b에 1대입하고 a가 2됨.
        System.out.println("a =" + a + ", b = " + b);
        
        //단독으로 증감연산자 쓰면 다른 연산이 없가 때문에 결과가 같다.

    }
}
