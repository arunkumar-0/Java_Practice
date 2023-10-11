package Sorting_Searching;

import java.util.*;

public class Insertion {
    public static void insertioSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 40, 1, 99, 15, 11, 19, 27, 45 };
        insertioSort(arr);
        String result = Arrays.toString(arr);
        System.out.println(result);

    }
}
