package com.nanos.dsa.arrays.searching.binaryleetcode;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {

        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];

        }
        int l=0,r=sum,m=0, res=0;
        while(l<=r){
            m=l+(r-l)/2;
        System.out.println(l+" "+r+" "+m+" "+isPossible(days,weights,m));
            if(isPossible(days,weights,m)){
                res=m;
                r=m-1;
            }else{

                l=m+1;
            }
        }
        return res;
    }
    public static boolean isPossible(int days,int[] weights,int cap){
        int t=0,sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>cap){
                sum=0;
                i--;
                t++;
            }
            if(t>days)
                return false;
        }
        t++;
        if(t>days)
            return false;
        else
            return true;
    }
}
