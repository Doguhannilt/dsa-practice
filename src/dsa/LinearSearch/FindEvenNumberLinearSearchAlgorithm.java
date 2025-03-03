
package dsa.LinearSearch;

public class FindEvenNumberLinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12,4,2,7565,4754,756,1,3,5,7};
        System.out.println(linearSearch(arr));
    }
    
    
    static int linearSearch(int[] arr){
        if(arr.length == 0) {return -1;}
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}


