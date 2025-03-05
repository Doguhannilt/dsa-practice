package dsa;

import java.util.HashMap;
import java.util.HashSet;

public class StringExamples {

    public static void main(String[] args) {
        String exampleVariable = "perché";

        // Find the length
        System.out.println("Length of " + exampleVariable + " is: " + exampleVariable.length());

        // Check if two strings are the same
        String exampleVariableTwo = "perche";
        System.out.println(exampleVariable.equals(exampleVariableTwo) ? "They are equal" : "They are not equal");

        System.out.println(findChar("perché", 'h'));
        System.out.println(checkIfStringIsBinary("000010101010"));
        System.out.println(checkIfStringIsBinary("perché"));
        System.out.println(convertToCamelCase("string examples"));
        System.out.println(isPanagram("The quick brown fox jumps over a lazy dog"));
        System.out.println(reverseString("hello world"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(countVowels("hello world"));
    }

    static int findChar(String s, char ch) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), i);
        }
        return map.getOrDefault(ch, -1);
    }

    static boolean checkIfStringIsBinary(String s) {
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    static String convertToCamelCase(String s) {
        StringBuilder res = new StringBuilder();
        boolean capitalizeNext = false;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                res.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static boolean isPanagram(String str) {
        if (str.length() < 26) return false;
        boolean[] letters = new boolean[26];
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
                if (count == 26) return true;
            }
        }
        return count == 26;
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] charCounts = new int[26];
        for (char c : s1.toCharArray()) charCounts[c - 'a']++;
        for (char c : s2.toCharArray()) {
            if (--charCounts[c - 'a'] < 0) return false;
        }
        return true;
    }

    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
