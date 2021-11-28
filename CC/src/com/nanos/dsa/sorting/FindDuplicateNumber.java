package com.nanos.dsa.sorting;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
//        System.out.println(findDuplicate(nums));
//        System.out.println(findDuplicate2(nums));
        System.out.println(findDuplicate3(nums));
    }
    public static int findDuplicate(int[] nums) {

        for (int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                return index+1;
            }
            nums[index]=nums[index]*-1;
        }
        return -1;
    }
    public static int findDuplicate2(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                swap(nums,correctIndex,i);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if((j+1)!=nums[j]){
                return nums[j];
            }
        }
        return -1;
    }
    public static void swap(int [] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public static int findDuplicate3(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            if(nums[i]!=i+1){
                if(nums[correctIndex]!=nums[i]){
                    swap(nums,correctIndex,i);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }

        }

        return -1;
    }
}
