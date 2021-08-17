package com.dsa.week.workshop.week3.string.problem;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        String  s1 = "-10";
        String  s2 = "0";
        System.out.println(multiplyStrings(s1,s2));
    }
    public static String multiplyStrings(String s1,String s2)
    {
        //code here.
        String res="";boolean signPos=true;
        if((s1.charAt(0)=='-'&&s2.charAt(0)!='-')||
                (s1.charAt(0)!='-'&&s2.charAt(0)=='-'))
            signPos=false;
        if(s1.charAt(0)=='-'){
            s1=s1.substring(1);
        }
        if(s2.charAt(0)=='-'){
            s2=s2.substring(1);
        }
        int n1= s1.length();
        int n2=s2.length();
        int [] sum=new int[n1+n2+1];
        for (int i=s1.length()-1;i>=0;i--){
            int carry=0,ni=s1.length()-1-i,nj=s2.length()-1;
            for (int j=s2.length()-1;j>=0;j--){
                int sn1=s1.charAt(i)-'0';
                int sn2=s2.charAt(j)-'0';
                nj=s2.length()-1-j;
                int mul=(sn1*sn2)+carry+sum[nj+ni];
                carry=mul/10;
                mul=mul%10;
                sum[nj+ni]=mul;
               // System.out.println(Arrays.toString(sum)+" "+nj+" "+ni+" "+mul+" "+carry);
            }
            if(carry>0){
                sum[nj+ni+1]+=carry;
            }
        }

        int i=0;
        for ( i=n1+n2;i>=0;i--){
            if(sum[i]!=0){
                break;
            }

        }

        for (int j=0;j<=i;j++){
            res=sum[j]+res;
        }
        if(res.length()==0)
            return "0";
        if(!signPos)
            res="-"+res;

        return res;

    }
}
