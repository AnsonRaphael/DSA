package com.nanos.algorithm.sort;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(20);
		}
		display(arr);

		for (int i = 1; i < arr.length; i++) {
			int key=arr[i]; // first element in unsorted section
			int j=i-1; // last pointer in  sorted* section
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j]; //shifting element towards first element in unsorted section						
				j--;
			}
			arr[j+1]=key; // inserting key in its position
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
