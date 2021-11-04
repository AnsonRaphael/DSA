package com.nanos.dsa.arrays.searching.binaryleetcode;

public class FindMinimumRotatedSortedArrayII {
    public static void main(String[] args) {
        //int[] nums={1,3,5};
        int[] nums={4,5,6,7,0,1,4};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int m= findPivot(nums);
        if(m==-1||m==nums.length-1)
            return nums[0];
        else
            return nums[m+1];
    }

    private static int findPivot(int[] nums) {
        int l=0,r=nums.length-1,m=0;

        while (l<=r){
            m=l+(r-l)/2;
            if(m<r&&nums[m]>nums[m+1]){
                return m;
            }
            if(m>l&&nums[m-1]>nums[m]){
                return m-1;
            }

            if(nums[l]==nums[m]&&nums[m]==nums[r]){
                // skip duplicate elements if it is not pivot from both ends
                if(l<r&&nums[l]>nums[l+1]){
                    return l;
                }
                l++;
                if(r>l&&nums[r-1]>nums[r]){
                    return r-1;
                }
                r--;
            }else if(nums[l]<nums[m]||(nums[l]==nums[m]&&nums[m]>nums[r])){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return -1;
    }
}
