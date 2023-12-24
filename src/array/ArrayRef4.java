package array;

public class ArrayRef4 {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50}; //최적화 가능.
        int[] students2 = {90, 80, 70, 60, 50}; //최적화 가능2. int[]을 보고 자바가 배열임을 추론함.
        //단, 줄 바뀌면 안됨. 한줄일 때는 자바가 타입정보를 보고 추론할 수 있는데 다른 줄이면 타입정보를 보고 추론하지 못한다.


        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수:" + students[i]);
        }
    }
}
