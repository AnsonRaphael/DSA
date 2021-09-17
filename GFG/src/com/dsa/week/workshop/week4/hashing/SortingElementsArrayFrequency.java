package com.dsa.week.workshop.week4.hashing;

import java.util.*;

public class SortingElementsArrayFrequency {
    public static void main(String[] args) {
        int arr[]={5,5,4,6,4};
        int n=5;
        System.out.println(sortByFreq(arr,n));
        System.out.println(sortByFreq1(arr,n));
    }
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> frq=new HashMap<>();

        for (int i=0;i<n;i++){
            if(frq.containsKey(arr[i])){
                frq.put(arr[i],frq.get(arr[i])+1);
            }else {
                frq.put(arr[i],1);
            }
        }
        ArrayList<Integer> res= new ArrayList<>();

        for (int i=0;i<n;i++){
            res.add(arr[i]);
        }
        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                int val=frq.get(t1)-frq.get(integer);
                if(val==0){
                    return integer-t1;
                }
                return val;
            }
        });
        return res;
    }

    static ArrayList<Integer> sortByFreq1(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> frq=new HashMap<>();

        for (int i=0;i<n;i++){
            if(frq.containsKey(arr[i])){
                frq.put(arr[i],frq.get(arr[i])+1);
            }else {
                frq.put(arr[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> cn=new  ArrayList<>(frq.entrySet());

        Collections.sort(cn, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                int val1=t1.getValue();
                int val2=t2.getValue();
                if(val1!=val2){
                    return val2-val1;
                }else {
                    int k1=t1.getKey();
                    int k2=t2.getKey();
                    return k1-k2;
                }

            }
        });
        ArrayList <Integer> ans = new ArrayList<Integer>();

        for(int i = 0;i<cn.size();i++)
        {
            int count = cn.get(i).getValue();

            while(count > 0)
            {
                ans.add(cn.get(i).getKey());
                count -- ;
            }
        }
        return ans;
    }
}
