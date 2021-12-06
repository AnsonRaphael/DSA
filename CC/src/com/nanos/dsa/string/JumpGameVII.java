package com.nanos.dsa.string;

public class JumpGameVII {
    public static void main(String[] args) {
        String s="011010";
        int minJump=2;
        int maxJump=3;
        System.out.println(canReach(s,minJump,maxJump));
    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        int[] rea=new int[s.length()];
        rea[0]=1;

        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'&&rea[i]==1){
                int min=i+minJump;
                int max=Math.min(i+maxJump,s.length()-1);
                for(int j=Math.max(min,m);j<=max;j++){
                    rea[j]=1;
                }
                m=max+1;
                if(m>=s.length())break;
            }

        }
        return rea[rea.length-1]==1&&s.charAt(rea.length-1)=='0';
    }
}
