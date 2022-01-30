package com.nanos.dsa.stackqueue;

public class Circulartour {
    public static void main(String[] args) {
        int[]Petrol = {4 ,6 ,7 ,4};

        int[]Distance = {6 ,5 ,3, 5};
        System.out.print(tour(Petrol,Distance));
    }
    static int tour(int petrol[], int distance[])
    {
        // Your code here
        int excess=0, req=0,val=0;
        for (int i = 0; i < petrol.length; i++) {
            int dif=petrol[i]+excess-distance[i];
            if(dif<0){
                req+=dif;
                excess=0;
                val=i+1;
            }else{
                excess=dif;
            }
        }
        if(req+excess>=0){
            return val;
        }else
            return -1;

    }

}
