package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; //배열 초기화시 값 할당

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수:" + students[i]);
        }
    }
}
