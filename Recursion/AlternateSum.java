package Recursion;

//find the alternate sum of the numbers
// for 10 => -10 + 9 - 8 + 7 ...... = -5
//for 5 => 5-4+3-2 +1 = 3
public class AlternateSum {
    public static int sumOfAlternate(int num) {

        if (num == 0) {

            return 0;
        } else if (num % 2 == 0) {
            return sumOfAlternate(num - 1) - num;
        } else {
            return sumOfAlternate(num - 1) + num;
        }

    }

    public static void main(String[] args) {
        int num = 21;
        int result = sumOfAlternate(num);
        System.out.println(result);
    }
}
