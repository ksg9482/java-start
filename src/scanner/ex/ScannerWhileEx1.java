package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = scanner.nextLine();//라인까지 읽어옴
            if (name.equals("종료")) {
                break;
            }
            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();//숫자만 읽어옴
            scanner.nextLine();//개행문자 남은 부분 읽어서 버림

            System.out.println("입력한 이름:" + name + ", 나이:" + age);
        }
    }
}
