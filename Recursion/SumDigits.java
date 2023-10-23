package Recursion;

import java.util.Scanner;

public class SumDigits {
    public static int sumOfDigits(int n) {
        int result = 0;
        if (n == 0) {
            return 0;
        } else {
            result = n % 10 + sumOfDigits(n / 10);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the digit : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfDigits(n);
        System.out.println(ans);
        sc.close();

    }
}
