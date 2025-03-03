
package dsa.LinearSearch;


public class EvenDigitsInLinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {18,129,9,176,98,1};
        System.out.println(findNumbers(arr));
    
    }
    
    // Q: Fin num. of nos. that have of digits.
    static int findNumbers(int[] arr){
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(hasEvenDigits(arr[i])){
                count++;
            }
        }
        return count;
    }
    
    static boolean hasEvenDigits(int num){
        int digitCount = String.valueOf(num).length();
        return digitCount % 2 == 0;
    }
}
