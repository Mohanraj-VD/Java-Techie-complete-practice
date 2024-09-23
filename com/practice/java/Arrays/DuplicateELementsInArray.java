package com.practice.java.Arrays;

import java.util.ArrayList;
/*Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3
Explanation: 2 and 3 occur more than once in the given array.*/

public class DuplicateELementsInArray {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3};
        System.out.println(duplicateElements(arr));
    }

    private static ArrayList<Integer> duplicateElements(int[] arr) {
      int n=arr.length;
        ArrayList myList = new ArrayList();
        int[] count=new int[n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(count[i]>1){
                myList.add(i);
            }
        }
        if(myList.isEmpty()){
            myList.add(-1);
        }
        return myList;
    }
}
