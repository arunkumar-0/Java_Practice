package Sorting_Searching;

class LowerBound {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 7, 7, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int low = 0;
        int high = arr.length - 1;
        int res = 0;
        int x = 9;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                // approch -1
                // for (int i = low; i <= mid; i++) {
                // if (arr[i] == x) {
                // System.out.println(i);
                // break;
                // } else {
                // System.out.println(mid);
                // }
                // }
                // break;
                high = mid - 1;
                res = mid;

            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        System.out.println(res);

    }
}