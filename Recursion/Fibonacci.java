package Recursion;

import java.util.Scanner;

class Fibonacci {
    public static int fibonacciNum(int n) {
        int result;
        if (n <= 1) {
            return n;
        } else {
            result = fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacciNum(n));
        sc.close();

    }
}
