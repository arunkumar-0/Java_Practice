package Recursion;

public class BinarySearch {
    public static int searchBinary(int arr[], int low, int high) {
        int x = 15;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                return searchBinary(arr, mid + 1, high);
            } else {
                return searchBinary(arr, low, mid - 1);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 12, 15, 20 };
        int low = 0;
        int high = arr.length - 1;

        int ans = searchBinary(arr, low, high);
        System.out.println(ans);

    }

}
