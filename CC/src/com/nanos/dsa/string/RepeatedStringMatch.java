package com.nanos.dsa.string;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a="a";
        String b="aa";
        System.out.println(repeatedStringMatch(a,b));
    }
    public static int repeatedStringMatch(String a, String b) {
            if(b.equals("")){
                return 0;
            }
            int count=0;
            StringBuilder sa= new StringBuilder();
            while (sa.length()<b.length()){
                sa.append(a);
                count++;
            }
            if(sa.toString().contains(b)){
                return count;
            }else{
                sa.append(a);
                if(sa.toString().contains(b)){
                    return count+1;
                }
            }
            return -1;
    }
}
