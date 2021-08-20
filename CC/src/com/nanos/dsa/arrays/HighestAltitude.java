package com.nanos.dsa.arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max=gain[0];
        int sum=gain[0];
        for(int i=1;i<gain.length;i++){
            sum+=gain[i];
            if(max<sum)
                max=sum;
        }
        if(max>0)
            return max;
        else
            return 0;
    }
}
