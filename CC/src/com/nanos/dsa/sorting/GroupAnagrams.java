package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
       // System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams2(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        String[] strsOrd=new String[strs.length];
        for (int i=0;i<strs.length;i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            strsOrd[i]=new String(tempArray);;
        }
        for (int i=0;i<strs.length;i++){
            List<String> oRes = new ArrayList<>();
            oRes.add(strs[i]);
            if(strs[i]!=null){
                for (int j=i+1;j<strs.length;j++){
                    if(strsOrd[i].equals(strsOrd[j])){
                        oRes.add(strs[j]);
                        strs[j]=null;
                    }
                }
                res.add(oRes);
                strs[i]=null;
            }

        }
        return res;
    }
    public static List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> reHash= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] st= strs[i].toCharArray();
            Arrays.sort(st);
            String or=String.valueOf(st);
            if(!reHash.containsKey(or)){
                reHash.put(or,new ArrayList<>());
            }
            reHash.get(or).add(strs[i]);        }
        for(List<String> val:reHash.values()){
            res.add(val);
        }
        return res;
    }
}
