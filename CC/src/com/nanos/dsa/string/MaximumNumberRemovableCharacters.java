package com.nanos.dsa.string;

public class MaximumNumberRemovableCharacters {
    public static void main(String[] args) {
        String s="qobftgcueho";
        String p="obue";
        int[] removable ={5,3,0,6,4,9,10,7,2,8};
        System.out.println(maximumRemovals(s,p,removable));
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        char[] st=s.toCharArray();
        char[] pt=p.toCharArray();

        int star=0,e=removable.length-1;
        int res=-1;
        while(star<=e){
            int m=(star+e)/2;
            if(isSubSequence(st,pt,removable,m)){
                res=m;
                star=m+1;
            }else{
                e=m-1;
            }
        }

        return res+1;
    }
    public static boolean isSubSequence(char[] st,char[] pt,int[] removable,int k){
        for(int i=0;i<=k;i++){
            st[removable[i]]+=30;
        }
        int kl=0;
        for(int i=0;i<st.length;i++){
            if(kl>=pt.length){
                break;
            }
            if(st[i]==pt[kl]){
                kl++;
            }
        }
        for(int i=0;i<=k;i++){
            st[removable[i]]=(char)(st[removable[i]]-30);
        }
        if(kl>=pt.length){
            return true;
        }else{
            return false;
        }
    }
}
