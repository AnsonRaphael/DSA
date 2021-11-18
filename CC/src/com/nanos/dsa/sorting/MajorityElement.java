package com.nanos.dsa.sorting;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int max_index=0,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[max_index]==nums[i]){
                count++;
            }else{
                count--;
                if(count==0){
                    max_index=i;
                    count=1;
                }

            }
        }
        return nums[max_index];
    }
}
