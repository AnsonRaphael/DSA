package com.cc.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items= new ArrayList<>();
        List<String> items1= new ArrayList<String>(
                List.of("phone","blue","pixel")
        );
        List<String> items2= new ArrayList<String>(
                List.of("computer","silver","lenovo")
        );
        List<String> items3= new ArrayList<String>(
                List.of("phone","gold","iphone")
        );
        items.add(items1);
        items.add(items2);
        items.add(items3);
        String ruleKey="color"; String ruleValue="silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column=0;
        if(ruleKey.equals("color"))
            column=1;
        if(ruleKey.equals("name"))
            column=2;
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(column).equals(ruleValue))
                count++;
        }
        return count;
    }
}
