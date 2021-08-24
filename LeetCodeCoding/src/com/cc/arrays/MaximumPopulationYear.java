package com.cc.arrays;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs={{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] birth=new int[logs.length];
        int[] death= new int[logs.length];
        for(int i=0;i<logs.length;i++){
            birth[i]=logs[i][0];
            death[i]=logs[i][1];
        }
        Arrays.sort(birth);
        Arrays.sort(death);
        int max=0,year=0,count=0;
        int i=0,j=0;
        while (i<logs.length&&j<logs.length){
            if(birth[i]<death[j]){
                count++;
                if(max<count){
                    year=birth[i];
                    max=count;
                }
                i++;
            }else {
                count--;
                j++;
            }

        }
        return year;
    }
    public int maximumPopulation1(int[][] logs) {
        int[] years = new int[2050-1950+1]; //1950 <= birthi < deathi <= 2050
        for(int[] l : logs){
            years[l[0]-1950]+=1;
            years[l[1]-1950]-=1;
        }
        int max = years[0];
        int maxYear = 0;
        for(int i=1;i<years.length;i++){
            years[i] +=years[i-1];

            if(max < years[i]){
                max = years[i];
                maxYear = i;
            }
        }
        return maxYear + 1950;
    }
}
