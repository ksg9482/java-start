package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        //조건을 만족하지 않아도 한번은 실행해야 할 때
        int i = 0;

        do {
            System.out.println(1);
            i++; //이 시점에서 i는 1이 된다.
        } while (i < 1); //1 < 1은 false. 1회 동작 후 반복하지 않는다.

    }
}
