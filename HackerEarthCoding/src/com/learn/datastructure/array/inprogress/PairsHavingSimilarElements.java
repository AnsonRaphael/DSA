package com.learn.datastructure.array.inprogress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
// not correct 
public class PairsHavingSimilarElements {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		String[] arr_A = br.readLine().split(" ");
		int[] A = new int[N];
		for (int i_A = 0; i_A < arr_A.length; i_A++) {
			A[i_A] = Integer.parseInt(arr_A[i_A]);
		}

		long out_ = SimilarElementsPairs(A, N);
		System.out.println(out_);

		wr.close();
		br.close();

	}

	public static long NcR(int n) {
		System.out.println(n + "--- ");
		return n*(n-1)/2;
	}

	

	static long SimilarElementsPairs(int[] A, int N) {
		Arrays.sort(A);
		
		boolean smil = false;
		int count = 1, same=1,sum = 0, tempCount = 0;
		for (int i = 0; i < A.length - 1; i++) {
			
			if ((A[i] == A[i + 1] + 1) ||(A[i+1] == A[i] + 1))  {				
				//smil = true;			
				count++;
			} else if (A[i] == A[i + 1]) {
				//if(smil)
				same++;
				count++;
				
			} else {
				if(same==count) {
					count = 1;
					same=1;
					
				}
				sum += NcR(count);				
				//}
				count = 1;
				same=1;
				smil=false;				
			}
			
		}
		if(same==count) {
			count = 1;
			same=1;
			
		}
		sum += NcR(count);	
		
		return sum;

	}
}
