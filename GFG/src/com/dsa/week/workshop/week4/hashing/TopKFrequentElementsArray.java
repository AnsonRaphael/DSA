package com.dsa.week.workshop.week4.hashing;

import java.util.*;

public class TopKFrequentElementsArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,3,4};
        int k=2;
        System.out.println(Arrays.toString(topK(nums,k)));
    }
    public static int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> frq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(frq.containsKey(nums[i])){
                frq.put(nums[i],frq.get(nums[i])+1);
            }else {
                frq.put(nums[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> cn = new ArrayList<Map.Entry<Integer,Integer>>(frq.entrySet());
        Collections.sort(cn, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                int val1=t1.getValue();
                int val2=t2.getValue();
                if(val1!=val2){
                    return val2-val1;
                }else {
                 return t2.getKey()-t1.getKey();
                }
            }
        });
        int[] res= new int[k];
        for (int i=0;i<k;i++){
            res[i]=cn.get(i).getKey();
        }
        return res;
    }
}
