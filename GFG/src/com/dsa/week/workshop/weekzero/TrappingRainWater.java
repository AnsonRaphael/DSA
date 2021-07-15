package com.dsa.week.workshop.weekzero;

public class TrappingRainWater {

    public static void main(String[] args) {
    int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));

    }

    public static int trap(int[] height) {
        int result=0;
        int len = height.length;
        int leftMax=0,rightMax=0;
        for(int i=0;i<len-1;i++){
            // left max for that index

            rightMax=0;
            if(height[i]>=leftMax)
                leftMax=height[i];
            // find right max
            for(int j=i+1;j<len;j++){
                if(height[j]>=rightMax){
                    rightMax=height[j];
                }
            }
            // find water in that index
            int w = Math.min(leftMax,rightMax)-height[i];
            if(w>0)
            result+=w;
            //System.out.println("i :- "+i+ "  lm "+leftMax+" rm "+rightMax+" w "+w);
        }
        return result;
    }

    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
