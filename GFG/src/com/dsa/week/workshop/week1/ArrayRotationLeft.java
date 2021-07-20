package com.dsa.week.workshop.week1;

public class ArrayRotationLeft {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int d=2;
        display(arr);
        rotateM3(arr,d);
        display(arr);
    }


    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }

    // time- O(N) Space-O(d)
    private static int[] rotateM1(int[] arr,int d){
        int[] temp = new int[d];
        // copy upto d index to temp
        for(int i=0;i<d;i++)
            temp[i]=arr[i];
        // shift d index to front
        for(int i=0;i<arr.length-d;i++)
            arr[i]=arr[i+d];
        //copy temp value
        for(int i=0;i<d;i++)
            arr[arr.length-d+i]=temp[i];

        return arr;
    }

    // time- O(nd) Space-O(1)
    private static int[] rotateM2(int[] arr,int d){
        int temp;
        for(int i=0;i<d;i++){
            temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }

    private static int[] rotateM3(int[] arr,int d){
        reverse(arr,0,d);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    private static int[] reverse(int[]arr,int st,int en){
        while(st<en){
            int tmp=arr[st];
            arr[st]=arr[en];
            arr[en]=tmp;
            st++;
            en--;
        }
        return arr;
    }
}
