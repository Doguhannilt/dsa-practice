/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        // Q: Store a roll number:
        int a = 19;

        // Q: Store a person's name
        String name = "Doğuhan";

        // @: Store 5 roll numbers
        int rnol = 1;
        int rnol2 = 2;
        int rnol3 = 3;
        int rnol4 = 4;
        int rnol5 = 5;

        // Syntax
        // datatype[] variable_name = new datatype[size];
        int[] rolls = new int[4];
        // or
        int[] rolls2 = {32, 13, 54, 78};

        int[] ex; // declaration of array. ex is getting defined in the stack. // COMPILE TIME
        ex = new int[5]; // initilisation: actually here object is being created in memory. // RUN TIME

        // in C language, objects in heap memory is contionus (one by one) but in Java, there is no proof
        // that objects are continous in heap memory. It depends on JVM.
        System.out.println(rolls2[0]); // 32
        System.out.println(rolls2[1]); // 13

        String[] arr = new String[4];
        System.out.println(arr[0]); // null! When array is empty, there is only null.

        String[] arr1 = new String[4];

        for (int i = 0; i < rolls2.length; i++) {
            System.out.println(rolls2[i]);
        }

        for (int num : rolls2) {
            System.out.println(num);
        };

        // array of objects
        String[] str = new String[2];
        str[0] = "Doğuhan";
        str[1] = "Doğuhan2";

        // Modify
        str[1] = "Doğu";

        for (String param : str) {
            System.out.println(param);
        }

        // 2D ARRAYS
        // [[1,2,3],[4,5,6],[7,8,9]]
        int[][] arr2dimension = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // input
        System.out.println(arr2dimension[0][1]);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(50);
        list.add(45);

        Integer max_value = 0;

        for (Integer param : list) {
            if (max_value < param) {
                max_value = param;
            };
        }
        System.out.println(max_value);

        

        for (Integer param : list) {
            if (param > param) {
                param = param;
            }
            System.out.println(param);
        }

        
    }
}
