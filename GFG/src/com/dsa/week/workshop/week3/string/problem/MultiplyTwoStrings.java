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





















    public static String multiplyStrings1(String s1,String s2)
    {
        //code here.


        String sum1="";
        String sum2="",prefix="";
        if(s1.length()>s2.length()){
            String t=s1;
            s1=s2;
            s2=t;
        }
        if(s1.contentEquals("0")||s2.contentEquals("0"))
            return "0";
        for (int i=s1.length()-1;i>=0;i--){
            int ca=0;
            prefix+="0";
            for (int j=s2.length()-1;j>=0;j--){
                int s1e=s1.charAt(i)-'0';
                int s2e=s2.charAt(j)-'0';
                int mul=(s1e*s2e)+ca;
                ca=mul/10;
                mul=mul%10;
                sum2=mul+sum2;
            }
            if(ca!=0)
                sum2=ca+sum2;

            sum1=sum(sum2,sum1);

            sum2=prefix;
        }

        return sum1;
    }
    static String reverse(String str){

        char[] arr=str.toCharArray();
        int l=0,r=arr.length-1;
        while (l<=r){
            char c=arr[l];
            arr[l]=arr[r];
            arr[r]=c;
            l++;
            r--;
        }
        return new String(arr);
    }
    static String sum(String str1,String str2){
        String rstr1=reverse(str1);
        String rstr2=reverse(str2),res="";
        int carry=0,i=0,k=0;
        while (i<str1.length()&&i<str2.length()){
            int a=rstr1.charAt(i)-'0',b=rstr2.charAt(i)-'0';
            int sum=a+b+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
            i++;
        }

        while (i<str1.length()){
            int a=rstr1.charAt(i)-'0';
            int sum=a+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
            i++;
        }
        while (i<str2.length()){
            int b=rstr2.charAt(i)-'0';
            int sum=b+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
            i++;
        }

        String resl=reverse(res);
       return resl;
    }
}
