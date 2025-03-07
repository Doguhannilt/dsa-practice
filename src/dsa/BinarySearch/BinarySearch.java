/**
 * This class provides various binary search implementations and related algorithms.
 * <p>
 * The methods included are:
 * <ul>
 *   <li>Standard Binary Search</li>
 *   <li>Ceiling (smallest number greater than or equal to target)</li>
 *   <li>Floor (largest number smaller than or equal to target)</li>
 *   <li>Finding the smallest character in an array greater than a target</li>
 *   <li>Finding the first and last position of an element in a sorted array</li>
 *   <li>Finding the peak index in a mountain array</li>
 * </ul>
 * </p>
 * <p>
 * All methods run with a time complexity of O(log N), ensuring efficient searching.
 * </p>
 *
 * @author Doguhan Ilter
 * @version 1.0
 */
public class BinarySearch {
    
    /**
     * Searches for a target element in a sorted array using binary search.
     *
     * @param arr    A sorted array of integers.
     * @param target The target value to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    /**
     * Finds the ceiling of a number in a sorted array.
     *
     * @param arr    A sorted array of integers.
     * @param target The target value to find the ceiling for.
     * @return The smallest number in the array that is greater than or equal to the target, or -1 if no such number exists.
     */
    public static int ceiling(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ceiling = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ceiling = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ceiling;
    }
    
    /**
     * Finds the floor of a number in a sorted array.
     *
     * @param arr    A sorted array of integers.
     * @param target The target value to find the floor for.
     * @return The largest number in the array that is smaller than or equal to the target, or -1 if no such number exists.
     */
    public static int floor(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int floor = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return floor;
    }
    
    /**
     * Finds the smallest character in a sorted character array that is larger than the given target.
     *
     * @param ch     A sorted array of characters.
     * @param target The target character.
     * @return The smallest character in the array that is greater than the target.
     */
    public static char findSmallestCharacter(Character[] ch, char target) {
        int left = 0, right = ch.length - 1;
        char character = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ch[mid] > target) {
                character = ch[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (character == 0) ? target : character;
    }
    
    /**
     * Finds the first and last position of a target element in a sorted array.
     *
     * @param arr    A sorted array of integers.
     * @param target The target value.
     * @return An array containing the first and last position of the target element, or [-1, -1] if not found.
     */
    public static int[] findFirstAndLastPosition(int[] arr, int target) {
        int first = searchPosition(arr, target, true);
        int last = searchPosition(arr, target, false);
        return new int[]{first, last};
    }
    
    private static int searchPosition(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                index = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }
    
    /**
     * Finds the peak index in a mountain array.
     *
     * @param arr A mountain array.
     * @return The index of the peak element.
     */
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
