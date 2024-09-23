package com.practice.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length; // Number of elements in the array
        int s = 12; // Target sum

        // Call the function to find the indices
        ArrayList<Integer> result = findSubarrayWithSum(arr, n, s);

        // Print the result
        if (result != null) {
            System.out.println(result.get(0) + " " + result.get(1));
        } else {
            System.out.println("No subarray found");
        }
    }

    public static ArrayList<Integer> findSubarrayWithSum(int[] arr, int n, int s) {
        // Iterate through the array
        int left = 0, currSum = 0;

        ArrayList<Integer> result = new ArrayList<>();

        for(int right = 0; right < n; right++) {
            currSum += arr[right];

            while(currSum > s && left < right) {
                currSum -= arr[left];
                left++;
            }

            if(currSum == s) {
                result.add(left + 1);

                result.add(right + 1);

                return result;
            }
        }

        result.add(-1);
        return result;
    }
}
