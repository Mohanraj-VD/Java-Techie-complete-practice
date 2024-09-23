package com.practice.java.Algorithms.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to sort : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in unsorted order: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(" Original array :");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    //Brute force method
    //Time complexity : O(N^2)
    private static void selectionSort(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            swap(array,i,minIndex);
        }
    }

    private static void swap(int[] array, int i, int j){
       int temp = array[i];
       array[i]=array[j];
       array[j]= temp;
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
