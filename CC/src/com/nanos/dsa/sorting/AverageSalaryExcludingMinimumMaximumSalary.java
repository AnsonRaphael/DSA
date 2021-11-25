package com.nanos.dsa.sorting;

public class AverageSalaryExcludingMinimumMaximumSalary {
    public static void main(String[] args) {
        int[] salary={4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
        }
        double result=0;
        int ln=salary.length-2;
        for(int i=0;i<salary.length;i++){
            if(!(min==salary[i]||max==salary[i])){
                result+= (salary[i])*1.0/ln;
            }
        }
        return result;
    }
}
