package com.learn.datastructure.array;

import java.util.Scanner;

//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/solve-friends-problem/

public class HelpThemOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		int total=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();			
		}
		
		while(!checkzoroes(a)) {
			total+=checkEvenandMan(a);
			if(!checkzoroes(a)) {
			divideMan(a);
			total++;
			}
		}
		System.out.println(total);
}
	public static boolean checkzoroes(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				return false;
		}
		return true;
	}
	
	public static int checkEvenandMan(int a[]) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				a[i]--;
				total++;
			}
		}
		
		return total;
	}
	public static void divideMan(int a[]) {
		
		for(int i=0;i<a.length;i++) {			
				a[i]=a[i]/2;
			
			}
		}
		
	
	
}
