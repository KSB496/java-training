package day10;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of array elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int k=0;
				if(arr[i]>arr[j]) {
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
