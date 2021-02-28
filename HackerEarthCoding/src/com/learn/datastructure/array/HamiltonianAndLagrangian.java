package com.learn.datastructure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamiltonianAndLagrangian {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[a];
		for (int i = 0; i < a; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int max = num[a - 1];
		StringBuilder stb = new StringBuilder();
		stb.append(max);
		for (int j = a - 2; j >= 0; j--) {
			if (max <= num[j]) {
				stb.insert(0, num[j] + " ");
				max = num[j];
			}
		}
		System.out.println(stb);

	}

}
