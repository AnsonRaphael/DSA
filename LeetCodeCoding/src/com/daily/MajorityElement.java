package com.daily;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int val =nums[0];
        int frq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val){
                frq++;
            }
            if(nums[i]!=val){
                frq--;
                if(frq==0){
                    frq++;
                    val=nums[i];
                }
            }
        }
        return val;
    }
}
