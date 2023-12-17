package cond;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;

        //2로 나눴을 때 나머지가 0이면 짝수
        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println(result);
    }
}
