package com.learn.card.array;

public class SortArrayByParity {

	public static void main(String[] args) {
		int nums  [] = new int[]{3,2,1,4};
		int pos=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				int temp=nums[pos];
				nums[pos]=nums[i];
				nums[i]=temp;
				pos++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
