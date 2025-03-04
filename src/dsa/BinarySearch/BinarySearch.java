
package dsa.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
                            // 7
            int[] arr = {2,20,6,9,11,12,14,4,36,48};
            Arrays.sort(arr);
            int target = 20;
            System.out.println(binarySearch(arr, target));
    }
    
    /* SORTED ARRAY
    * Find the middle element
    * Check if the target element is greater than middle then search in the right otherwiese search in the left O(logN)
    * If the middle element == target, then you've found the answer. O(1)
    */
    
    // return the index
    // return -1 if it does not exists
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

