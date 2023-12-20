package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        //비효율적 메모리 사용. if 블록 내부에서만 필요하지만 temp변수는 main()종료까지 살아있다.
        //코드 복잡성 증가. if 코드 블록이 끝나도 main()어디서나 temp를 여전히 접근할 수 있다.
        //유지보수 할 때도 m은 물론이고 temp도 신경써야 한다.

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
