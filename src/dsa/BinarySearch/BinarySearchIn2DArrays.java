/**
 * This class provides a method to perform binary search in a sorted 2D matrix.
 * The matrix is sorted in a way that:
 * - Each row is sorted in ascending order from left to right.
 * - Each column is sorted in ascending order from top to bottom.
 */
public class BinarySearchIn2DArrays {
    
    /**
     * Searches for a target value in a sorted 2D matrix and returns its position.
     * The matrix must satisfy the following conditions:
     * - Each row is sorted in ascending order.
     * - Each column is sorted in ascending order.
     *
     * @param matrix The 2D array where search is performed.
     * @param target The value to search for.
     * @return An integer array containing row and column indices of the target if found, otherwise {-1, -1}.
     *
     * Time Complexity Analysis:
     * - We start from the top-right corner (0, n-1).
     * - At each step, we either move left (decrease column) or move down (increase row).
     * - In the worst case, we traverse at most (m + n) elements, where m is the number of rows and n is the number of columns.
     * - Thus, the time complexity is O(m + n).
     */
    static int[] RowColMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1; // Corrected: Access column length
        
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c}; // Found the target
            }
            if (matrix[r][c] < target) {
                r++; // Move down since the target is greater
            } else {
                c--; // Move left since the target is smaller
            }
        }
        return new int[]{-1, -1}; // Target not found
    }
}