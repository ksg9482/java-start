package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        changeNumber(num1);
        System.out.println(num1);
    }
    public static void changeNumber (int number) {
        System.out.println(number);
        number = number * 2;
        System.out.println(number);
    }
}
