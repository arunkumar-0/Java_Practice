package Array;

import java.util.Scanner;

//optimised approach for finding any sum of sub matrix
public class PrefixSum1 {

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row r1 ");
        int r1 = sc.nextInt();

        System.out.println("enter the row c1 ");
        int c1 = sc.nextInt();

        System.out.println("enter the row r2 ");
        int r2 = sc.nextInt();

        System.out.println("enter the row c2 ");
        int c2 = sc.nextInt();

        int result = sumRegion(arr, r1, c1, r2, c2);

    }
}
