package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5
        System.out.println("div1 = " + div1); //int / int

        double div2 = 3 / 2; //1.0
        System.out.println("div2 = " + div2); //3 / 2는 int 타입. 하지만 double이므로 자동 형변환

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 = " + div3); //double / int 타입 계산. -> int타입이 double타입으로 형변환이 발생한다.

        double div4 = (double) 3 / 2; //1.5
        System.out.println("div4 = " + div4); //명시적 형변환. 3 -> 3.0이 됨. 이후로 같음.

        int a = 3;
        int b = 2;
        double result = (double) a / b; //소수점까지 원할 경우 double로 명시하면 된다.
        System.out.println("result = " + result); //1.5
    }
}
