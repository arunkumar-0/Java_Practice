package Recursion;

public class Multiples {
    public static void findMUltiple(int n, int k) {

        if (k == 1) {
            System.out.println(n);
        } else {
            findMUltiple(n, k - 1);
            System.out.println(n * k);
        }
    }

    public static void main(String[] args) {
        int n = 24;
        int k = 5;
        findMUltiple(n, k);
        System.out.println();
    }
}
