package com.nanos.dsa.sorting;

import java.util.*;

public class SortArrayIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums ={31,-19,7,97,97,7,31,-93,-19,97,7,7,7,31,7,-93,97,-93,7,-93,-93,7,-19,31,-93,-93,31,-93,97,97,-93,-19,97,-19,-19,7,-93,7,-19,-93,-19,7,-19,-93,97,-93,97,97,-93,97,97,-93,7,-19,-19,31,-93,-93,31,7,-19,-19};

        System.out.println(Arrays.toString(frequencySort(nums)));
        System.out.println(Arrays.toString(frequencySort2(nums)));
    }
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> frq = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(frq.containsKey(nums[i])){
                frq.put(nums[i],frq.get(nums[i])+1);
            }else{
                frq.put(nums[i],1);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(isSwap(nums[j],nums[j+1],frq)){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        return nums;


    }
    public static boolean isSwap(int a, int b, HashMap<Integer,Integer> frq){
        boolean flag = true;
        int k=frq.get(a);
        int l=frq.get(b);
        if(k==l){
            if(a>b){
                return !flag;
            }else{
                return flag;
            }
        }else if(k>l){
            return flag;
        }else{
            return !flag;
        }
    }
    public static int[] frequencySort2(int[] nums) {
        HashMap<Integer,Integer> frq = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int cnt= frq.getOrDefault(nums[i],0);
            frq.put(nums[i],cnt+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int flag = 1;
                int k=frq.get(a);
                int l=frq.get(b);
                if(k==l){
                    if(a==b){
                        return 0;
                    }
                    if(a>b){
                        return -1;
                    }else{
                        return flag;
                    }
                }else if(k>=l){
                    return flag;
                }else{
                    return -1;
                }
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i]= arr.get(i);
        }
        return nums;


    }
}
