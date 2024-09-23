package com.practice.java.Arrays;

import java.util.Arrays;

/*Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.*/
public class SecondLargest {

    public static void main(String[] args) {
        int arr[]={2,34,36,1,8,37,36};
        System.out.println(secondLargestInArray(arr));
    }

    private static int secondLargestInArray(int[] arr) {
       Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
       int n = arr.length;
       int largest = arr[n-1];
       for(int i = n-2;i>=0;i--){
           if(arr[i]!=largest){
               return arr[i];
           }
       }
       return -1;
    }
}
