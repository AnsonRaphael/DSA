package com.datastructureI;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if(nums1.length<nums2.length){
                int[] temp=nums1;
                nums1=nums2;
                nums2=temp;
            }

            HashMap<Integer,Integer> frq = new HashMap<>();
            for(int i=0;i<nums2.length;i++){
                frq.put(nums2[i],frq.getOrDefault(nums2[i],0)+1);
            }
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                if(frq.containsKey(nums1[i])){
                    int f=frq.get(nums1[i]);
                    if(f>0)
                        res.add(nums1[i]);
                    f--;

                    frq.put(nums1[i],f);
                }
            }
            int[] resl=new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resl[i]=res.get(i);
            }
            return resl;
        }
    }
}
