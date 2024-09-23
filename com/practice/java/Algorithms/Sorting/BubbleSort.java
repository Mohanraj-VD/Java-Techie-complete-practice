package com.practice.java.Algorithms.Sorting;

import java.util.Scanner;

public class BubbleSort {
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

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    //Using brute force method
    //Time complexity O(N^2)
//    private static void bubbleSort(int[] array) {
//        int n = array.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    // Swap array[j] and array[j + 1]
//                    swap(array, j);
//                }
//            }
//        }
//    }

    //Using do-while
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    swap(array, j);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    
    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
