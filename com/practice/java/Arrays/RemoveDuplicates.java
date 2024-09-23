package com.practice.java.Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;
public class RemoveDuplicates {
	//{ Driver Code Starts
	//Initial Template for Java

	
	    public static void main(String[] args) throws IOException
	    {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        while(T-->0)
	        {
	            int n = sc.nextInt();
	            int[] nums = new int[n];
	            for(int i = 0; i < n; i++)
	                nums[i] = sc.nextInt();
	            RemoveDuplicates ob = new RemoveDuplicates();
	            int[] ans = ob.common_digits(nums);
	            for(int i = 0; i < ans.length; i++)
	                System.out.print(ans[i] + " ");
	            System.out.println();
	        }
	    }
	

	// } Driver Code Ends


	//User function Template for Java

	    public int[] common_digits(int[] nums)
	    {
	        // code here
	        HashSet<Integer> num = new HashSet<Integer>();
	        
	        for(int i=0;i<nums.length;i++){
	            while(nums[i]>0){
	                num.add(nums[i]%10);
	                nums[i]/=10;
	                }
	            }
	            int[] c = new int[num.size()];
	            int k=0;
	            Iterator<Integer> it = num.iterator();
	            while(it.hasNext()){
	                c[k++]=it.next();
	                
	            }
	            return c;
	        
	    }
	
}
