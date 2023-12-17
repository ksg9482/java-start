package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        //삼항 연산자는 ()괄호 안에 조건을 넣는다. 안써도 되긴 한다.
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println(status);
    }
}
