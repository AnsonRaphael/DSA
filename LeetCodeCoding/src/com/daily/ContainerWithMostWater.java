package com.daily;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int s=0,e=height.length-1,m=0;
        while(s<e){
            int temp=Math.min(height[s], height[e])*(e-s);
            Math.abs(temp);
            if(temp>max)
                max=temp;
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }

        }
        return max;
    }
}
