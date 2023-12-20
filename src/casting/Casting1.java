package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        //longValue = (long) intValue; //원래는 형변환 해줘야 함.
        System.out.println(longValue); //허용됨

        doubleValue = intValue;
        System.out.println(doubleValue); //허용됨. 소수점 생김

        doubleValue = 20L;//long
        System.out.println(doubleValue); //허용됨. 소수점 생김

        //개념적으로 다음과 같이 동작한다
        doubleValue = intValue;
        doubleValue = (double) intValue;
        doubleValue = (double) 10;
        doubleValue = 10.0;
        System.out.println(doubleValue);
    }
}
