
package dsa.LinearSearch;

public class FindingRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {12,4,2,3,4754,756,1,3,3,3,5,7};
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }
    
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {return -1;}
        
        for (int i = 1; i < arr.length; i++) {
            if(target == arr[i])
            {return i;}
        }
        
        return -1;
    }
}