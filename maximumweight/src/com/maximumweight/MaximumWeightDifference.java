package com.maximumweight;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of  items to be brought");
		int size=sc.nextInt();
		int [] arr= new int [size];
		
		int count=1;

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the weight of items "+count);
			arr[i]=sc.nextInt();
			count=count+1;

		}
		int len=arr.length;
		System.out.println("Enter the number of items to be carried by the child");

		int min=sc.nextInt();

		
		Arrays.sort(arr);
		int minweight=0;
		int maxweight=0;
		
		for(int j=0;j<min;j++) {
			minweight=minweight+arr[j];
			
		}
		System.out.println("minimum weight ="+minweight);
		
		for(int i=len-1;i>=min;i--) {
			maxweight=maxweight+arr[i];
		}
		System.out.println("maximunm weight="+maxweight);
		
		
		System.out.println("Diference in maximum and minimum weight="+(maxweight-minweight));
		
		
		
		
		

	}

}
