package com.nanos.dsa.string;

public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        String s="krpgjbjjznpzdfy";
        String t="nxargkbydxmsgby";
        int maxCost=14;
        System.out.println(equalSubstring(s,t,maxCost));
    }
    public static  int equalSubstring(String s, String t, int maxCost) {
        int [] cost=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int maxLn=0;
        int st=0,et=0,sum=cost[et];;
        while (st<s.length()&&et<s.length()){
            if(sum<=maxCost){
                if((1+et-st)>maxLn)
                    maxLn=(1+et-st);
                et++;
                if(et<s.length())
                sum+=cost[et];
            }else{
                sum-=cost[st];
                st++;
            }
        }
        return maxLn;
    }
}
