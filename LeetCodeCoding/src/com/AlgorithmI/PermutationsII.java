package com.AlgorithmI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> res= new HashSet<>();
        List<Integer> cur = new ArrayList<>();
        perm1(res,nums,0,new boolean[nums.length],cur);
        return new ArrayList(res);
    }

    public void perm1(HashSet<List<Integer>> res, int[] nums, int i, boolean[] vis, List<Integer> cur){
        if(cur.size()==nums.length){
            res.add(new ArrayList(cur));
            return;
        }

        for(int j=0;j<nums.length;j++){
            if(vis[j]) continue;
            vis[j]=true;
            cur.add(nums[j]);
            perm1(res,nums,i+1,vis,cur);
            vis[j]=false;
            cur.remove(cur.size()-1);

        }

    }
    public List<List<Integer>> permuteUnique2(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        perm2(res,nums,0,new boolean[nums.length],cur);
        return new ArrayList(res);
    }
    public void perm2(List<List<Integer>> res, int[] nums, int i, boolean[] vis, List<Integer> cur){
        if(cur.size()==nums.length){
            res.add(new ArrayList(cur));
            return;
        }

        for(int j=0;j<nums.length;j++){
            if(vis[j]) continue;
            if(j > 0 && ! vis[j-1] && nums[j] == nums[j-1]) continue;
            vis[j]=true;
            cur.add(nums[j]);
            perm2(res,nums,i+1,vis,cur);
            vis[j]=false;
            cur.remove(cur.size()-1);

        }

    }
}
