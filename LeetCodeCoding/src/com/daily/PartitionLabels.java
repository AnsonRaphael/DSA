package com.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character,Integer> las=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            las.put(s.charAt(i),i);
        }
        int start =0,end=0;
        while (end<s.length()){
            for (int i = start; i <= end; i++) {
                end=Math.max(end,las.get(s.charAt(i)));
            }
            res.add(end-start+1);
            end++;
            start=end;
        }
        return res;
    }
}
