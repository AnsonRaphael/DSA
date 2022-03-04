package com.daily;

import java.util.ArrayList;
import java.util.List;

public class ChampagneTower {
    public static void main(String[] args) {

    }

    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured==0)
            return 0;
        List<Double> current= new ArrayList<>();
        current.add((double) poured); // first row
        while (query_row-- >0){
            List<Double> temp = new ArrayList<>();
            //first value
            temp.add(Math.max(0,(current.get(0)-1)/2));
            for (int i = 1; i < current.size(); i++) {
                temp.add(Math.max(0,(current.get(i-1)-1)/2)+Math.max(0,(current.get(i)-1)/2));
            }
            temp.add(temp.get(0));
            current= new ArrayList<>(temp);
        }

        return Math.min(1,current.get(query_glass));
    }
}
