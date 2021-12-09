package com.nanos.dsa.string;

public class CountNumberofHomogenousSubstrings {
    public static void main(String[] args) {
        String s="abbcccaa";
        System.out.println(countHomogenous(s));
    }
    public static int countHomogenous(String s) {
        int res=0;
        int mod = 1000000007;
        int st=0,cnt=0;
        char c=s.charAt(0);
        while(st<s.length()){
            if(st<s.length()&&s.charAt(st)==c){
                cnt++;
                res=((res)+cnt)%mod;

            }else{
                c=s.charAt(st);
                st--;
               cnt=0;
            }
            st++;
        }
        return res;
    }

}
