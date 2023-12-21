package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일오류 발생. 손실변환 발생.
        intValue = (int) doubleValue; //double을 강제로 int변환. 1.5 -> 1.

    }
}
