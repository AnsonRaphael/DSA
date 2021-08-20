package com.nanos.dsa.arrays;

public class FindNumbersEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums={252};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int l=nums[i];
            l=(int)Math.log10(l)+1;

            if(l%2==0)
                count++;
        }
        return count;
    }
}
