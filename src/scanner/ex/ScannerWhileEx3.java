package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하여면 -1을 입력하세요:");
        /*while (true) {
            int intValue = scanner.nextInt();
            if (intValue == -1) {
                break;
            }
            sum += intValue;
            count ++;
        }*/

        //반복문 축약
        //-1이 아닐때까지 반복한다
        while ((input = scanner.nextInt()) != -1){ //while문에서 처리하는 방식. 괄호 안 코드가 먼저 계산되고 부등식 연산.
            sum += input;
            count ++;
        }
        double average = (double)sum / (double) count; //int타입운 double로 캐스팅해줘야 함.
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
