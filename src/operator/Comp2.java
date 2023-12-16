package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello1".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //==은 특정조건에서 어긋나면 true가 나오지 않는다. 클래스 등.
    }
}
