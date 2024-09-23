package com.practice.java.Algorithms.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3, 9, 6, 8, 5};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

