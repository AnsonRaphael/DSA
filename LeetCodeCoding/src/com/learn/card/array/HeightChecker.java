package com.learn.card.array;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int A[]= new int[]{1,1,4,2,1,3};
		int B[] = new int[A.length];
		B=A.clone();
		Arrays.sort(A);
		int diff =0;
		for(int i=0;i<A.length;i++) {
			if(B[i]!=A[i]) {
				diff++;
			}
		}

	}

}
