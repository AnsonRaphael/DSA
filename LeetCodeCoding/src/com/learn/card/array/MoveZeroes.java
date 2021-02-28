package com.learn.card.array;

public class MoveZeroes {

	public static void main(String[] args) {
		int nums  [] = new int[]{0,1,0,3,12};
		int pos=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[pos]=nums[i];
				pos++;
			}
		}
		for(int i=pos;i<nums.length;i++) {
			nums[i]=0;
						
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
