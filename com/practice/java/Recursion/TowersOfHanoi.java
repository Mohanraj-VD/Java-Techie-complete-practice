package com.practice.java.Recursion;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int N = 3;
        char from_rod = 'A';
        char to_rod = 'C';
        char aux_rod = 'B'; //mid rod
        towerofHanoi(N, from_rod, aux_rod, to_rod);
    }

    private static void towerofHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n==0){
            return;
        }
        towerofHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Move disk "+n+" from rod"+fromRod+" to rod"+toRod);
        towerofHanoi(n-1, auxRod, toRod, fromRod);

    }
}
