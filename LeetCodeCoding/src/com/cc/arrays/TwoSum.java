package com.cc.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer,Integer> valpos= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            valpos.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(valpos.containsKey(k)){
                int pos=valpos.get(k);
                if(pos!=i){
                    res[0]=i;
                    res[1]=pos;
                    return res;
                }
            }
        }
        return res;
    }
}
