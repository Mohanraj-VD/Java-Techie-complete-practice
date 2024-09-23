package com.practice.java.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class DistinctDigitArray {
    public static void main(String[] args) {
        int[] nums = {131, 11, 48};

        // Create a set to hold distinct digits
        Set<Character> distinctDigits = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // Convert the number to a string
            String numStr = Integer.toString(num);
            // Add each digit to the set
            for (char digit : numStr.toCharArray()) {
                distinctDigits.add(digit);
            }
        }

        // Convert the set to an array of integers
        int[] distinctDigitArray = new int[distinctDigits.size()];
        int index = 0;
        for (char digit : distinctDigits) {
            distinctDigitArray[index++] = Character.getNumericValue(digit);
        }

        // Sort the array (optional)
        Arrays.sort(distinctDigitArray);

        // Print the result
        System.out.println(Arrays.toString(distinctDigitArray));
    }
}
