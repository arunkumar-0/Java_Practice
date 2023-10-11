package Array;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 9, 7, 7, 10, 10 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("the duplicate number is " + arr[i]);
                }

            }

        }
    }
}
