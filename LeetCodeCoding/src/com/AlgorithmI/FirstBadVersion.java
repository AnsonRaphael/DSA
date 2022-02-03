package com.AlgorithmI;

public class FirstBadVersion {
    boolean isBadVersion(int version){return true;}
    public int firstBadVersion(int n) {
        int res=1;
        int l=1,r=n,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(isBadVersion(m)){
                res=m;
                r=m-1;
            }else{
                l=m+1;

            }
        }
        return res;
    }
}
