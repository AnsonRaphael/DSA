package com.nanos.dsa.arrays.searching.binaryleetcode;

public class MaximumValueGivenIndexBoundedArray {
    public static void main(String[] args) {
        int n=8257285,index=4828516, maxSum=850015631;
        //int n = 6, index = 1,  maxSum = 10;
        //int n = 8, index = 7,  maxSum = 14;
        //int n = 9, index = 5,  maxSum = 24;
        //int n = 4, index = 0,  maxSum = 4;

        System.out.println(maxValue(n,index,maxSum));
    }
    public static int maxValue(int n, int index, int maxSum) {
        int l=1,r=maxSum,m=0,res=0;
        while (l<=r){
            m=l+(r-l)/2;
            System.out.println(l+" "+r+" "+m);
            if(isPossbile(m,index,maxSum,n)){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }

        return res;
    }

        private static boolean isPossbile(int target, int index, int maxSum, int n) {
            long sum=0;
            sum=getsum(target,index+1)+getsum(target,n-index)-target;
//            System.out.println(getsum(target,index+1)+" "+getsum(target,n-index));
//            System.out.println(target+" "+index);
            System.out.println(sum+" "+maxSum);

            if(sum<=(long)maxSum)
                return true;
            else
                return false;
        }

        public static long getsum(long target,long length){
            long sum=0;
            if(length>target){
                sum+=(target+1)*target/2;
                sum+=length-target;

            }else {
                long min=target-length+1;
                sum+=(min+target)*length/2;
            }
        return sum;
        }
}
