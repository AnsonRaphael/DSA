package com.dsa.week.workshop.week3.string;

public class RabinKarpAlgorithmPatternSearching {
    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        search(pat, txt, q);
    }
    static int d=256;
    private static void search(String pat, String txt, int q) {
        int n = txt.length();
        int m= pat.length();
        int i,j;
        int p=0,t=0,h=1;
        for (i=0;i<m-1;i++){
            h=(h*d)%q;
        }
        for (i=0;i<m;i++){
            p=((p*d)+pat.charAt(i))%q;
            t=((t*d)+txt.charAt(i))%q;
        }
        for (i=0;i<n-m;i++){

            if(p==t){
                for (j=0;j<m;j++){
                    if(txt.charAt(i+j)!=pat.charAt(j)){
                        break;
                    }
                }
                if(j==m){
                    System.out.println("found at index "+i);
                }
            }
           // t= (int) (((t-txt.charAt(i)*Math.pow(d,m-1))*d+txt.charAt(i+m))%q);
            t=  ((t-txt.charAt(i)*h)*d+txt.charAt(i+m))%q;
            if (t < 0)
                t = (t + q);
        }
    }

}
