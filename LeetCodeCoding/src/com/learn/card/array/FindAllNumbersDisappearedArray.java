package com.learn.card.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {

	public static void main(String[] args) {
		int nums[]= new int[]{4,3,2,7,8,2,3,1};
		List<Integer> rus= new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int t=nums[i];			
			if(t<0) {
				t=-1*t;
			}
			t=t-1;			
			if(nums[t]>=0) {
				nums[t]=-1*nums[t];
			}
		}
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>0) {
				rus.add(i+1);
			}
		}
System.out.println(rus.toString());
	}

}
