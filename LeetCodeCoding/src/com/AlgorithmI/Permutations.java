package com.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums={1,2,3};

        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> unprocessed = new ArrayList<>();
        List<Integer> processed = new ArrayList<>();
        permute(processed,nums,res);
        return res;
    }

    private static void permute(List<Integer> processed,int[] nums, List<List<Integer>> res) {
        if(processed.size()==nums.length)
            res.add(new ArrayList<>(processed));

        for (int j = 0; j < nums.length; j++) {
            if(processed.contains(nums[j]))
            continue;
            processed.add(nums[j]);
            permute(processed,nums,res);
            processed.remove(processed.size()-1);
        }

    }
}
