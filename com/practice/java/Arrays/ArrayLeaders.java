package com.practice.java.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args) {
       int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(5,arr));
    }

    private static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> myList = new ArrayList();
        int maxFromRight = arr[n-1];
        myList.add(maxFromRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight=arr[i];
                myList.add(maxFromRight);
            }
        }

//        ArrayList<Integer> finalList = new ArrayList<Integer>();
//        for(int i=myList.size()-1;i>=0;i--){
//            finalList.add(myList.get(i));
//
//        }
        Collections.reverse(myList);
        return myList;
    }
}
