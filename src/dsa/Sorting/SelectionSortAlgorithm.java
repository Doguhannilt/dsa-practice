package dsa;

import java.util.Arrays;

public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 5, 4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        selection(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap max element with the last unsorted element
            int last = arr.length - i - 1;
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
}