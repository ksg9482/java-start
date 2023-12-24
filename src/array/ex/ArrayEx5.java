package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int count = input.nextInt();
        int[] arr = new int[count];
        int sum = 0;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
            sum += arr[i]; //input.nextInt()으로 하면 저장된 값을 받는게 아니라 이제부터 입력하는 값을 받겠다는 뜻. 저장된걸 써야함
        }

        System.out.println("입력한 정수의 합계: " + sum);
        double average = (double) sum / count;
        System.out.print("입력한 정수의 평균: " + average);
    }
}
