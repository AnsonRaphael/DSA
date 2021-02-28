package com.learn.card.array;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int A[]= new int[]{-4,-1,0,3,10};
		int B[] = new int[A.length];
		int right=A.length-1;
		int left=0;
		int bPos=right;
		while(right>=left) {		
			if((A[right]*A[right])>(A[left]*A[left])) {
				B[bPos]=A[right]*A[right];
				right--;
			}else {
				B[bPos]=A[left]*A[left];
				left++;
			}
			bPos--;
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println(B[i]);
		}
	}

}
