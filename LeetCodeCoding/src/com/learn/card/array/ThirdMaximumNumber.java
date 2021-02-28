package com.learn.card.array;

public class ThirdMaximumNumber {
// need to improve
	public static void main(String[] args) {
		int nums[]= new int[]{1,2,-2147483648};
		int min=Integer.MIN_VALUE;		
		int maxs[]=new int[]{min,min,min};			
		int maxspoint[]=new int[]{0,0,0};
		for(int i=0;i<nums.length;i++) {
			if(maxs[0]<=nums[i]) {				
				maxs[0]=nums[i];
				maxspoint[0]=i;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(maxs[1]<=nums[i]&&nums[i]!=maxs[0]) {				
				maxs[1]=nums[i];
				maxspoint[1]=i;
			}
		}		
		for(int i=0;i<nums.length;i++) {
			if(maxs[2]<=nums[i]&&nums[i]!=maxs[1]&&nums[i]!=maxs[0]) {				
				maxs[2]=nums[i];
				maxspoint[2]=i;				
			}
		}
		if(maxs[0]!=maxs[1]&&maxs[1]!=maxs[2]&&(maxs[2]!=min||nums[maxspoint[2]]==min)) {
			System.out.println(maxs[2]); 
		}else {
			System.out.println(maxs[0]); 
		}

	}

}
