package com.nanos.dsa.arrays.searching.binaryleetcode;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    public static int firstBadVersion(int n) {
        int l=1,r=n,m=1;
        while (l<=r){
            m=l+(r-l)/2;
            boolean val=isBadVersion(m);
            boolean val1=isBadVersion(m-1);
            if(val==true&&val1==false){
                return m;
            }
            if(val==true){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }
    public static boolean isBadVersion(int k){
        int l=4;

        if(k>=l)
            return true;
        else
            return false;

    }
}
