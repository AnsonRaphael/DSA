package com.nanos.dsa.string;

public class DecryptStringfromAlphabetIntegerMapping {
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));
        System.out.println(freqAlphabets2(s));
    }

    private static String freqAlphabets2(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
               // int off =Integer.parseInt(s.substring(i-2,i))-1;
                char c=(char) ('a'+Integer.parseInt(s.substring(i-2,i))-1);
                sb.append(c);
                i=i-2;
            }else{
//                int off =Integer.parseInt(s.charAt(i)+"")-1;
                char c=(char) ('a'+s.charAt(i)-'1');
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splited=s.split("[#]");
        for(int i=0;i<splited.length-1;i++){
            int j=0;
            for(j=0;j<splited[i].length()-2;j++){
                char c= Decrypt(""+splited[i].charAt(j));
                sb.append(c);
            }
            sb.append(Decrypt(splited[i].substring(splited[i].length()-2))) ;
        }
        //check last part
        if(s.charAt(s.length()-1)=='#'){
            for(int j=0;j<splited[splited.length-1].length()-2;j++){
                char c= Decrypt(""+splited[splited.length-1].charAt(j));
                sb.append(c);
            }
            sb.append(Decrypt(splited[splited.length-1].substring(splited[splited.length-1].length()-2))) ;
        }else{
            for(int j=0;j<splited[splited.length-1].length();j++){
                char c= Decrypt(""+splited[splited.length-1].charAt(j));
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static char Decrypt(String sn){
        int off = Integer.parseInt(sn)-1;
        char a=(char) ('a'+off);
        return a;
    }
}
