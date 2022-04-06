package com.daily;

public class _3SumWithMultiplicity {
    public static void main(String[] args) {

    }
    public int threeSumMulti(int[] arr, int target) {
        long[] count = new long[101];
        long mod=1000_000_007;
        long result=0;
        for (int a:arr) {
            count[a]++;
        }

        for (int i = 0; i < 101; i++) {
            for (int j = i; j < 101; j++) {
                int k=target-i-j;
                if(k<0||k>100)
                    continue;

                if(i==j&&j==k)
                    result+=(count[i]*(count[i]-1)*(count[i]-2))/6;
                else if(i==j&& j!=k)
                    result+=((count[i])*(count[i]-1)*count[k])/2;
                else if(i<j&&j<k){
                    result+=((count[i])*(count[j])*count[k]);
                }
                result %=mod;
            }
        }

        return (int) result;
        
    }
}
