package Array;

import java.util.Arrays;

//rotate the matrix in clowise direction 90 degree
public class Rotation {
    public static void RotatedMatrix(int arr[][]) {
        // step1 - transpose of a matrix
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

        // step2 - swap b/w columns
        for (int i = 0; i < n; i++) {
            int li = 0;
            int ri = n - 1;

            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, },
                { 4, 5, 6, },
                { 7, 8, 9 } };
        RotatedMatrix(arr);

        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }

    }
}
