package dsa.LinearSearch;

public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2};
        int target = 2;
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }

    // Search in the array: return the index if item is found, otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }

    // TRUE - FALSE
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return true;
            }
        }

        return false;
    }
    
    
    
    
}
