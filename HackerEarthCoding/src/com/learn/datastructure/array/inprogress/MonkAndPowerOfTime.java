package com.learn.datastructure.array.inprogress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// not working - nned to study Queue to attempt this.
//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/
public class MonkAndPowerOfTime {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] ar1= new int[n];
		int[] ar2= new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=Integer.parseInt(st1.nextToken());
			ar2[i]=Integer.parseInt(st2.nextToken());
		}
		int total=0;
		for(int i=0;i<n;i++) {
			int t=ar2[i];
			//System.out.println(ar2[i]);
			//System.out.println(ar1[0]+" "+ar1[1]+" "+ar1[2]+" ");
			int indexoft=indexof(ar1, t);
			//System.out.println(indexoft);
			int tmp=ar1[i];
			ar1[i]=t;
			ar1[indexoft]=tmp;
			int shiftValue=indexoft-i;
			total+=shiftValue+1;
		}
		System.out.println(total);		
		
		
	}
	public static int indexof(int[] a,int k) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				return i;
			}
		}
		return -1;
	}

}
