package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = input.nextInt();
        int[][] students = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수: ");
                students[i][j] = input.nextInt();
            }
        }

        for (int studentIdx = 0; studentIdx < count; studentIdx++) {
            int sum = 0;
            for (int scoreIdx = 0; scoreIdx < students[studentIdx].length; scoreIdx++) {
                sum += students[studentIdx][scoreIdx];
            }

            double average = 0;
            
            System.out.print((studentIdx + 1) + "번 학생의 총점: ");
            System.out.print(sum + ", ");
            average = (double) sum / students[studentIdx].length;
            System.out.print("평균: ");
            System.out.println(average);
        }
    }
}
