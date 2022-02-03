package com.AlgorithmI;

public class SquaresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res= new int[nums.length];
        int s=0,e=nums.length-1;
        int k=nums.length-1;
        while(s<=e){
            if((nums[s]*nums[s])>=(nums[e]*nums[e])){
                res[k]=(nums[s]*nums[s]);
                s++;
            }else{
                res[k]=(nums[e]*nums[e]);
                e--;
            }
            k--;
        }
        return res;
    }
}
