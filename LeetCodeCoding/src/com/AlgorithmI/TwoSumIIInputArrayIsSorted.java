package com.AlgorithmI;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int check=target-numbers[i];
            int found=Arrays.binarySearch(numbers,check);
            if(found>=0&&found!=i){
                if(i<found){
                    res[0]=i+1;
                    res[1]=found+1;
                }else{
                    res[1]=i+1;
                    res[0]=found+1;
                }
                break;
            }
        }
        return res;
    }
}
