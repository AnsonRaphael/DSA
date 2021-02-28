package com.learn.datastructure.array.inprogress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/help-jarvis-8a39566e/
public class HelpJarvis {
public static void main(String[] args) throws IOException {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();

	for(int i=0;i<n;i++) {
		int a= sc.nextInt();
		String nm=Integer.toString(a);
		int l=nm.length();
		int []nml=new int[l];
		for(int j=0;j<l;j++) {
			nml[j]=nm.charAt(j)-'0';
		}
		
		Arrays.sort(nml);
		System.out.print(i+" "+nm+" ");
		if(checkWork(nml)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

    }
    public static boolean checkWork(int a[]) {
	    	
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]-1) {
			return false;
		}
	}
	return true;
	
}
}
