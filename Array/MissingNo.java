package Array;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7 };
        // expected output - the missing number is - 3
        int n = arr.length;
        // sum of 1st n natural number
        int sum_natural_no = ((n + 1) * (n + 2)) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int result = sum_natural_no - sum;
        System.out.println("Missing element in the array is " + result);
    }
}
