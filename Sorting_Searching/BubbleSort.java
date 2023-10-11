package Sorting_Searching;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 30, 50, 100, 110, 10, 5, 4 };

        System.out.println("the sorted array is");
        String result = Arrays.toString(arr);
        System.out.println(result);

    }
}
