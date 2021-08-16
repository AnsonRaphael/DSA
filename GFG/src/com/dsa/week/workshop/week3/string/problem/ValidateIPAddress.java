package com.dsa.week.workshop.week3.string.problem;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String ip = "1.211.214.6";
        System.out.println(isValid(ip));
    }
    public static boolean isValid(String s) {
        // Write your code here
        int prv=0,end=0,in=0;
        for (int i=0;i<s.length();i++){
            end=i;
            if(s.charAt(i)=='.'||i==s.length()-1){
                in++;
                if(i==s.length()-1)
                    end++;
                String sbt=s.substring(prv,end);
                System.out.println(sbt);
                if(sbt.indexOf('0')==0&&sbt.length()>1)
                    return false;
                if(sbt.length()>3)
                    return false;
                if(!valid(sbt))
                    return false;
                prv=end+1;
            }
        }
        if(in!=4)
            return false;
        return true;
    }
    static boolean valid(String st){
        if(st.length()==0)
            return false;
        for (int i=0;i<st.length();i++){
            int m=st.charAt(i)-'0';
            if(m<0||m>9){
                return false;
            }
        }
        int val=Integer.parseInt(st);
        if(val>=0&&val<256){
            return true;
        }
        return false;
    }
}
