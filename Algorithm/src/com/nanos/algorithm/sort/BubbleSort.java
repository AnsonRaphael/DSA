package com.nanos.algorithm.sort;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(20);
		}
		display(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1, arr);
				}
			}
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
