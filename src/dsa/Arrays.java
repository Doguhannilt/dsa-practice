package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysExample {

    public static void main(String[] args) {
        // Example: Store a roll number
        int rollNumber = 19;

        // Example: Store a person's name
        String name = "Doğuhan";

        // Example: Store multiple roll numbers using an array
        int[] rollNumbers = {1, 2, 3, 4, 5};

        // Array declaration and initialization
        int[] numbers = new int[4];
        int[] predefinedNumbers = {32, 13, 54, 78};

        // Declaration of an array (only stack memory allocation, no heap allocation yet)
        int[] dynamicArray;
        dynamicArray = new int[5]; // Now memory is allocated in heap

        // Printing array elements
        System.out.println(predefinedNumbers[0]); // Output: 32
        System.out.println(predefinedNumbers[1]); // Output: 13

        // String array initialization (default values are null)
        String[] stringArray = new String[4];
        System.out.println(stringArray[0]); // Output: null

        // Looping through an array using a traditional for-loop
        for (int i = 0; i < predefinedNumbers.length; i++) {
            System.out.println(predefinedNumbers[i]);
        }

        // Looping through an array using enhanced for-loop
        for (int num : predefinedNumbers) {
            System.out.println(num);
        }

        // Array of objects (String array)
        String[] names = new String[2];
        names[0] = "Doğuhan";
        names[1] = "Doğuhan2";

        // Modifying an array element
        names[1] = "Doğu";

        for (String param : names) {
            System.out.println(param);
        }

        // 2D ARRAYS (Matrix representation)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println(matrix[0][1]); // Output: 2

        // Working with ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(50);
        list.add(45);

        // Finding the maximum value in an ArrayList
        int max_value = Integer.MIN_VALUE;
        for (Integer param : list) {
            if (param > max_value) {
                max_value = param;
            }
        }
        System.out.println("Max value: " + max_value);

        // Additional Example: Taking array input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Array elements you entered:");
        for (int num : userArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}