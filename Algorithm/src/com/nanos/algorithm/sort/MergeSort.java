package com.nanos.algorithm.sort;

import java.util.Random;

public class MergeSort {
// not done correctly
	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(20);
		}
		display(arr);
		
		mergeSort( arr,0,arr.length);
		
		display(arr);
	}
public static void mergeSort(int[] arr,int s,int e) {
	
	if(e-s<2) {
		return;
	}
	int m=(s+e)/2; //middle
	 mergeSort( arr,s,m);
	 mergeSort( arr,m,e);
	 merge(arr,s, m, e);
}
	
public static void merge(int[] arr,int s,int m,int e) {
	
	//optimization- already sorted 
	if(arr[m-1]<arr[m]) {
		return;
	}
	int [] temparray = new int[e-s];
	int tempIndex=0;
	int i=s,j=m;
	// we copy sorted value to temparray
	while(i<m&&j<e) {
		temparray[tempIndex++]=arr[i]<=arr[j]?arr[i++]:arr[j++]; //<= important for sdtability
	}
	// need to take acre of copy rest of data, if it is right side don't need to worry as that data will be
	// already in ints right place
	// copy data if it is left
	while(i<m) {
		temparray[tempIndex++]=arr[i++];
	}
	// if you want you can copy right data, not advaised - another optimizatiun to skip that
	//setting starting index from which orginal array need to be altered
	j=s;
	// copy sorted temp  array to orginal
	for( i=0;i<tempIndex;i++) {
		arr[j++]=temparray[i];
	}
		
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
