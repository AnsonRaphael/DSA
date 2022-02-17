package com.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[]candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==0)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lm = new ArrayList<>();
        combinationSum1(res,lm,0,0,candidates,target);
        return res;
    }

    public static void combinationSum1(List<List<Integer>> res ,List<Integer> processed, int process,int start ,int[] candidates, int target) {
        if(process==target){
            res.add(new ArrayList<>(processed));
            return;
        }

        if(process>target||start>=candidates.length)
            return;

        // adding same value again and trying
            process+=candidates[start];
            processed.add(candidates[start]);
            combinationSum1(res,processed,process,start,candidates,target);
            // not adding same value and trying
            processed.remove(processed.size()-1);
            process=process-candidates[start];
            combinationSum1(res,processed,process,start+1,candidates,target);

    }
}
