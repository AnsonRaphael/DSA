package com.datastructureI;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valPos= new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(valPos.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=valPos.get(target-nums[i]);
                break;
            }
            valPos.put(nums[i],i);
        }
        return res;
    }
}
