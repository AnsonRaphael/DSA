package com.learn.card.array;

public class RemoveDuplicateInPlace {

	public static void main(String[] args) {
		int num  [] = new int[]{0,0,1,1,1,2,2,3,3,4};
		int pos=0;
		for(int i=0;i<num.length;i++) {
			if(num[pos]!=num[i]) {
				pos++;
				num[pos]=num[i];				
			}
		}
		for(int i=0;i<=pos;i++) {
			System.out.println(num[i]);
		}
	}

}
