package com.practice.java.Arrays;

public class Kadane_s_Algorithm {
    public static void main(String[] args) {
       int[] arr = new int[]{1,2,3,-2,5};
       int[] arr2 = new int[]{1,2,4,-2,3,-6};
        System.out.println(maxSubarraySum(arr));
        System.out.println(maxSubarraySum(arr2));
        
    }

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
   static int maxSubarraySum(int[] arr) {

        // Your code here
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
