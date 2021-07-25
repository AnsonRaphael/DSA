package com.dsa.week.workshop.week1.array;

public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        int leftsum=0,ans=0;
        for (int i=0;i<arr.length;i++){
            totalSum=totalSum-arr[i];
            if(leftsum==totalSum){
                ans=i;
                break;
            }
            leftsum+=arr[i];
        }
        System.out.println(ans);
    }
}
