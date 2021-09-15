package com.dsa.week.workshop.week4.hashing;

import java.util.HashMap;

public class LargestSubArrayWithZeoSum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=8;
        System.out.println(maxLen(arr,n));
    }
    static int maxLen(int arr[], int n)
    {
        // Your code here
        int sum=0,max=0;
        HashMap<Integer,Integer> val = new HashMap<>();
        for (int i=0;i<n;i++){
            sum += arr[i];

            if (arr[i] == 0 && max == 0)
                max = 1;

            if (sum == 0)
                max = i + 1;

            // Look this sum in hash table
            Integer prev_i = val.get(sum);

            // If this sum is seen before, then update max_len
            // if required
            if (prev_i != null)
                max = Math.max(max, i - prev_i);
            else // Else put this sum in hash table
                val.put(sum, i);
        }
        return max;
    }
}
