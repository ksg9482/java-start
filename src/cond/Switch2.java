package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        //JAVA14에서 추가된 switch문.
        //스위치 값에 해당하는 내용이 변수에 대입됨
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
