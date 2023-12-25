package method.ex;
public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance = deposit(balance, depositAmount);

        int withdrawAmount = 2000;
        balance = withdraw(balance, withdrawAmount);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int money) {
        int resultBalance = balance + money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + resultBalance
                + "원");
        return resultBalance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            int resultBalance = balance - money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " +
                    resultBalance + "원");
            return resultBalance;
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }
}