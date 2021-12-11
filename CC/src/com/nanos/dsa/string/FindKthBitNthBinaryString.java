package com.nanos.dsa.string;

public class FindKthBitNthBinaryString {
    public static void main(String[] args) {
        int n=3;
        int k=1;
        System.out.println(findKthBit(n,k));
    }
    public static char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder();
        s.append("0");
        for(int i=2;i<=n;i++){
            s.append("1");
            s.append(revApp(s.substring(0,s.length()-1)));
        }
        return s.charAt(k-1);
    }

    public static String revApp(String s){
        StringBuilder tm=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            String val=s.charAt(i)=='0'?"1":"0";
            tm.append(val);
        }
        return tm.toString();
    }
}
