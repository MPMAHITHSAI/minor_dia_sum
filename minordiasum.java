package Minordiasum;

import java.util.Scanner;

public class minordiasum {
	public static int diagonalSum(int arr[][],int n) {
		int val=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n-1;j--) {
			
			if (i<n && j>=0) {
				sum+=arr[i][j];
		}
		
	}val= sum;
		}
		return val;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int val=diagonalSum(arr,n);
		System.out.println(val);

	
	}
}