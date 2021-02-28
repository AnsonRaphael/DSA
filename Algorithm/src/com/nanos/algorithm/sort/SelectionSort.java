package com.nanos.algorithm.sort;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(20);
		}
		display(arr);

		for (int i = 0; i < arr.length; i++) {
			int swapIndex=0;
			int j=1;
			for (j = 1; j < arr.length - i ; j++) {
				if (arr[j] > arr[swapIndex]) {
					swapIndex=j;					
				}
			}
			swap(j-1, swapIndex, arr);
		}
		display(arr);
	}

	public static void swap(int i, int j, int[] arr) {

		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

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
