package com.learn.datastructure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*Property: The length of the every given side must be less than the sum of the other remaining sides.*/
public class PolygonPossibility {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for (int k = 0; k < n; k++) {
				a[k] = Integer.parseInt(st.nextToken());
			}
			long sum = 0, max = 0;
			for (int m = 0; m < n; m++) {
				sum += a[m];
				if (max < a[m])
					max = a[m];
			}
			if (max < (sum - max)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}

//for (int i = 0; i < t; i++) {
//	int n = Integer.parseInt(br.readLine());
//	int a[] = new int[n];
//	String str = br.readLine();
//	StringTokenizer st = new StringTokenizer(str);
//	for (int k = 0; k < n; k++) {
//		a[k] = Integer.parseInt(st.nextToken());
//	}
//	boolean flag1 = false;
//	for (int m = 0; m < n; m++) {
//		long sum = 0;
//
//		for (int l = 0; l < n; l++) {
//			if (l != m) {
//				sum += a[l];
//			}
//		}
//		if (a[m] >= sum) {
//			flag1 = true;
//			break;
//		}
//	}
//	if (!flag1) {
//		System.out.println("YES");
//	} else {
//		System.out.println("NO");
//	}
//}