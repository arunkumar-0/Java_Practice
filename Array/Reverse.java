package Array;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 12, 14 };
        // output = {14 , 12 , 10 , 8 , 4 , 2}

        int n = arr.length;
        System.out.println("the reversed array is ");

        // Method 1
        for (int i = n - 1; i >= 0; i--) {
            int arr2[] = { arr[i] };
            System.out.print(arr2[0] + " ");

        }
        System.out.println();
        // Method 2
        for (int i = 0; i < n / 2; i++) {
            // swapping of fist and last element
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
