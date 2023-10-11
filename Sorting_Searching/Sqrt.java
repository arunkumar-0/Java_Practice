package Sorting_Searching;

import java.util.Scanner;

//to find out the square root of the number if the number is not perfect square than print the floor value ex- for 12 u need to print 3
public class Sqrt {
    public static int squareRoot(int num) {
        int low = 0, high = num, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = mid * mid;
            if (value == num) {
                return mid;
            } else if (value > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = squareRoot(num);
        System.out.println("The square root is " + result);
        sc.close();
    }
}
