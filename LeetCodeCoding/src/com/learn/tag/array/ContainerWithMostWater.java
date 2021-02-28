package com.learn.tag.array;

public class ContainerWithMostWater {
//https://leetcode.com/problems/container-with-most-water/
	public static void main(String[] args) {
		int [] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	 public static int maxArea(int[] height) {
		 int max=0;
		 for(int i=1;i<=height.length;i++) {
			for(int j=1;j<=height.length;j++) {
				int temp=Math.min(height[i-1], height[j-1])*(j-i);
				Math.abs(temp);
				if(temp>max)
					max=temp;
			}
		 }
		  return max;	        
	    }
	 
	
}
