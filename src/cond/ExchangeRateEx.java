package cond;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollor = 10;
        int rate = 1300;

        if (dollor < 0) {
            System.out.println("잘못된 금액");
        } else if (dollor == 0) {
            System.out.println("환전할 금액 없음");
        } else {
            int won = dollor * rate;
            System.out.println("환전 금액 " + won);
        }
    }
}
