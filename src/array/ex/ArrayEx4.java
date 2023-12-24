package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i]; //input.nextInt()으로 하면 저장된 값을 받는게 아니라 이제부터 입력하는 값을 받겠다는 뜻. 저장된걸 써야함
        }

        System.out.println("입력한 정수의 합계: " + sum);

        System.out.print("입력한 정수의 평균: ");
        double average = (double) sum / arr.length;
        System.out.println(average);
    }
}
