package Array;

import java.util.Scanner;

//find the sum of the submatrix whose coordinated are given by the user     
public class PrefixSum {
    static int sum = 0;

    public static int AddMatrix(int[][] arr, int r1, int c1, int r2, int c2) {
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {

                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please eneter row r1");
        int r1 = sc.nextInt();

        System.out.println("Please enter column c1 ");
        int c1 = sc.nextInt();

        System.out.println("please enter row r2");
        int r2 = sc.nextInt();

        System.out.println("please enter column c2 ");
        int c2 = sc.nextInt();

        AddMatrix(arr, r1, c1, r2, c2);
        System.out.println(sum);
        sc.close();

    }
}
