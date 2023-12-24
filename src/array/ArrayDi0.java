package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //행(row), 열(column)

        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        //0행
        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.print(arr[0][2]);
        System.out.println();
        //한 행 끝나면 줄바꿈

        //1행
        System.out.print(arr[1][0]);
        System.out.print(arr[1][1]);
        System.out.print(arr[1][2]);
    }
}
