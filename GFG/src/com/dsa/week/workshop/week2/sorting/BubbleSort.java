package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;
/*Each time an element will be compared with adjacent element if the element is greater its positioned is swapped,*/
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={4, 3, 2, 10, 12, 1, 5, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){

        for (int i=0;i<arr.length;i++){
            boolean swap=false;
            for (int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    swap=true;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swap){
                break;
            }

        }
    }
}
