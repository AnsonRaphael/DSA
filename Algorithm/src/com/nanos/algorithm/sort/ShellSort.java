package com.nanos.algorithm.sort;

import java.util.Random;

public class ShellSort {
// not done correctly
	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(20);
		}
		display(arr);
		for(int gap =arr.length/2;gap>0;gap=gap/2) {
			for (int i = gap; i < arr.length; i++) {
				int key=arr[i]; // first element in unsorted section
				int j=i-gap; // last gapth pointer in  sorted* section
				while(j>=gap&&arr[j]>key) {
					arr[j+gap]=arr[j]; //shifting element towards first element in unsorted section						
					j=j-gap;
				}
				arr[j+gap]=key; // inserting key in its position
			}
		}
		
		display(arr);
	}

	

	public static void display(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1))
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + " ,");

		}
		System.out.println("]");
	}

}
