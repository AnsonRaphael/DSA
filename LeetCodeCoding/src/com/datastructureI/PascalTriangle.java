package com.datastructureI;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
     System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> data = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1)
                    data.add(1);
                else
                    data.add(res.get(res.size()-1).get(j-1)+res.get(res.size()-1).get(j));
            }
            res.add(data);
        }
        return res;
    }
}
