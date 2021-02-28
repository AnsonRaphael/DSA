package com.learn.datastructure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChargedUpArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] arr_A = br.readLine().split(" ");
			long[] A = new long[N];
			for (int i_A = 0; i_A < arr_A.length; i_A++) {
				A[i_A] = Long.parseLong(arr_A[i_A]);
			}

			int out_ = solve(A, N);
			System.out.println(out_);
			System.out.println("");
		}

		wr.close();
		br.close();

	}

	static int solve(long[] A, int N) {
		int sum=0;
		double Ki=Math.pow(2, (N-1));
		for(int i=0;i<N;i++) {
			if(A[i]>=Ki) {
				sum=(int) ((sum+A[i])%1000000007);
			}
		}
		
		return (int) (sum);
	}
	
}