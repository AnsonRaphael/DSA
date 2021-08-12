package com.nanos.dsa.introduction.conditionals_loops;

public class ElectricityBill {
    public static void main(String[] args) {
        int un=250;
        System.out.println(electricityBill(un));
    }
    static double electricityBill(int unit){
        double res=0;
        if(unit<100){
            res=unit*10;
        }else if(unit<200){
            res=100*10+(unit-100)*15;
        }else if(unit<300){
            res=100*10+(100)*15+(unit-200)*20;
        }else {
            res=100*10+(100)*15+(200)*20+(unit-300)*25;
        }

        return res;
    }
}
