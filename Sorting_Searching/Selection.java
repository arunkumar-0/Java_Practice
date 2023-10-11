package Sorting_Searching;

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        int min_idx, i;
        min_idx = i = 0;

        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 20, 50, 10, 15, 17, 25, 90, 2, 23 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
