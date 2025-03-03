
package dsa.LinearSearch;


public class SearchInRange {
    public static void main(String[] args) {
        // arr = {18,12,-7,3,14,28}
        // Q: Search for 3 in the range of index [1,4]
        
        int[] arr = {18,3,-7,5,14,18};
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }
    
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) {return -1;}
        
        for (int i = 1; i < 4; i++) {
            if(arr[i] == target) {return i;}
        }
        return -1;
    }
}
