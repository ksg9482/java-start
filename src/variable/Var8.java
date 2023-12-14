package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; //-32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; //뒤에 L(l)을 붙여야 한다. 보통 대문자 L

        //실수
        float f = 10.0f; //뒤에 f를 붙여야 한다. 7자리 정밀도
        double d = 10.0; //15자리 정밀도. double 정밀도가 높다.

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
