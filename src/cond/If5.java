package cond;

public class If5 {
    public static void main(String[] args) {
        //각각이 독립조건일 경우 if여러번 쓴다.
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 1000) {
            discount = discount + 1000;
            System.out.println(discount);
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println(discount);
        }

        System.out.println("총 할인금액 " + discount);

        //한줄이면 블럭 생략 가능. 한줄은 아래로 내려가도 됨. 하지만 권장 안함. 그냥 코드 블럭 쓰는게 좋다.
        if (true) System.out.println("if문에서 실행");
    }
}
