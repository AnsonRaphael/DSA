package com.dsa.week.workshop.week3.string.problem;

public class ConvertRomanNo {
    public static void main(String[] args) {
        int n=45;
        System.out.println(convertToRoman1(n));
    }
   static  String convertToRoman(int n) {
        //code here
       String res="";
       int m=n;
       while (n!=0){
          if(n>=1000){
              res= digit('M',n/1000,res);
              n=n%1000;
          }else if(n>=500){
              if(n>=900){
                  res=res+"CM";
                  n=n%100;
              }else {
                  res= digit('D',n/500,res);
                  n=n%500;
              }
          }else if(n>=100){
              if(n>=400){
                  res=res+"CD";
                  n=n%100;
              }else {
                  res= digit('C',n/100,res);
                  n=n%100;
              }
          }else if(n>=50){
              if(n>=90){
                  res=res+"CD";
                  n=n%10;
              }else {
                  res= digit('C',n/50,res);
                  n=n%50;
              }
          }else if(n>=10){
              if(n>=40){
                  res=res+"XL";
                  n=n%10;
              }else {
                  res= digit('X',n/10,res);
                  n=n%10;
              }
          }else if(n>=5){
              if(n>=9){
                  res=res+"IX";
                  n=n%5;
              }else {
                  res= digit('V',n/5,res);
                  n=n%5;
              }
          }else if(n>1){
              if(n>=4){
                  res=res+"IV";
                  n=n%1;
              }else {
                  res= digit('I',n/1,res);
                  n=n%1;
              }
          }



       }
        return res;
    }
    static String digit(char ch,int m,String str){
        for (int i=0;i<m;i++){
            str=str+ch;
        }
        return str;
    }

    static  String convertToRoman1(int n) {
        String m[] ={"","M","MM","MMM"};
        String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String x[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        String thou=m[(n)/1000];
        String hun=c[(n%1000)/100];
        String ten=x[(n%100)/10];
        String on=i[(n%10)/1];
        String res=thou+hun+ten+on;
        return res;

    }

}
