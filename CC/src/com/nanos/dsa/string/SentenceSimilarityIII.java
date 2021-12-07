package com.nanos.dsa.string;

public class SentenceSimilarityIII {
    public static void main(String[] args) {
        String sentence1;
        String sentence2;
//        String sentence1="Eating right now";
//        String sentence2="Eating";
        sentence1 = "M K ZFOU VjO db QVCWvtv FQsnsyQ S" ;
        sentence2 = "M K ZFOU VjO db QVCWvtv FQsnsyQ S";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1arr=sentence1.split(" ");
        String[] s2arr=sentence2.split(" ");
        if(s1arr.length<s2arr.length){
            String[] tmp=s2arr;
            s2arr=s1arr;
            s1arr=tmp;
        }

            int s=0,e=s2arr.length-1,es=s1arr.length-1;
            int prec=0,sufc=0;
            while (s<=e){
                if(!(s1arr[s].equals(s2arr[s])||(s1arr[es].equals(s2arr[e])))){
                    break;
                }
                if(s1arr[s].equals(s2arr[s])){
                    prec++;
                    s++;
                }else if(s1arr[es].equals(s2arr[e])){
                    sufc++;
                    e--;
                    es--;
                }
            }
            if(prec+sufc==s2arr.length){
                return true;
            }


        return false;
    }
}
