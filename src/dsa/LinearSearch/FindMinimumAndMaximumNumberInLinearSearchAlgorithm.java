
package dsa.LinearSearch;


public class FindMinimumAndMaximumNumberInLinearSearchAlgorithm {
    public static void main(String[] args) {
            int[] arr = {18,12,-7,3,-2,14,28};
           System.out.println(min(arr));
    }
    
    // Q: Find minimum number in an array
    static int min(int[] arr) {
        if(arr.length == 0) {return -1;}
        int ans = arr[0]; // 18 is default in the beginning
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
