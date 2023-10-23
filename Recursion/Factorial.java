package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorialNum(int n) {
        int result;

        if (n == 0 || n == 1) {
            return 1;

        } else {
            result = n * factorialNum(n - 1);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of which you want factorial ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorialNum(n);
        System.out.println(ans);

        sc.close();
    }
}
