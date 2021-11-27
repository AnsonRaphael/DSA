package com.nanos.dsa.sorting;

import java.util.*;

public class Three3Sum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }
//    public  static List<List<Integer>> threeSum(int[] nums) {
//        HashMap<Integer,Integer> valpos= new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            valpos.put(nums[i],i);
//        }
//        int target=0;
//        Set<List<Integer>> res = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            int k=target-nums[i];
//            Set<List<Integer>> ret = twoSum(nums, k, valpos);
//            for (List<Integer> resi:ret) {
//                if(resi.get(0)!=resi.get(1)&&resi.get(0)!=i&&i!=resi.get(1)){
//                    ArrayList<Integer> oneRes= new ArrayList<>();
//                    oneRes.add(nums[resi.get(0)]);
//                    oneRes.add(nums[resi.get(1)]);
//                    oneRes.add(nums[i]);
//                    Collections.sort(oneRes);
//                    res.add(oneRes);
//                }
//            }
//            }
//        return new ArrayList<>(res);
//        }
//
//
//    public static Set<List<Integer>> twoSum(int[] nums, int target, HashMap<Integer,Integer> valpos) {
//
//        Set<List<Integer>> res = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            int k=target-nums[i];
//            if(valpos.containsKey(k)){
//                int pos=valpos.get(k);
//                if(pos!=i){
//                    ArrayList<Integer> oneRes= new ArrayList<>();
//                    oneRes.add(i);
//                    oneRes.add(pos);
//                    Collections.sort(oneRes);
//                     res.add(oneRes);
//                }
//            }
//        }
//        return res;
//    }

    public  static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum>0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
