package Recursion;

import java.util.Scanner;

//find the power of the number entered by the user
// a = 2 ; b = 4 than a^b = 16
public class Power {
    // Approach - 1 (UN-OPTIMIZED)
    // public static int findPower(int a, int b) {
    // int ans = 0;
    // if (b == 1) {
    // return a;
    // } else {
    // ans = a * findPower(a, b - 1);
    // return ans;
    // }
    // }

    // Approch - 2 (OPTIMIZED)

    // To use this approach on very large number we need to use bog integer because
    // integer would not be enough to store that much big value
    public static int findPower(int a, int b) {
        int ans = 0, finalans = 0;
        if (b == 1) {
            return a;
        } else {
            ans = findPower(a, b / 2);
            finalans = ans * ans;
            if (b % 2 == 0) {
                return finalans;
            } else {
                return a * finalans;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int result = findPower(a, b);
        System.out.println("The value of a^b is : " + result);

        sc.close();
    }
}
