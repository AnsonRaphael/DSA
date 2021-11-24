package com.nanos.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray {
    public static void main(String[] args) {
        int[] arr={40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] sr= Arrays.copyOf(arr,arr.length);
        Arrays.sort(sr);
        HashMap<Integer,Integer> elementRankMap = new HashMap<>();
        int rank=1;
        for(int i=0;i<sr.length;i++){
            if(!elementRankMap.containsKey(sr[i])){
                elementRankMap.put(sr[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            int tempRank=elementRankMap.get(arr[i]);
            arr[i]=tempRank;
        }
        return arr;
    }
}
