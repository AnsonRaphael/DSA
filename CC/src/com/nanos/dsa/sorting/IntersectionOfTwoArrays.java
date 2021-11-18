package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> frq= new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            frq.put(nums1[i],1);
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(frq.containsKey(nums2[j])&&frq.get(nums2[j])==1){
                ans.add(nums2[j]);
                frq.put(nums2[j],0);
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
