package com.daily;

import java.util.Arrays;

public class BoatstoSavePeople {
    public static void main(String[] args) {
        int[] people={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res=0;
        int s=0,e=people.length-1;
        while (s<=e){
            long rt=people[s]+people[e];
            if(rt<=limit){
                res++;
                s++;
                e--;
            }else {
                e--;
                res++;
            }
        }
        return res;
    }
}
