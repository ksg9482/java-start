package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        //일반
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문
        for (int number : numbers) {
            System.out.println(number);
        }

        //향상된 for문 못쓰는 경우 -> 증가하는 인덱스 값이 필요할때

    }
}
