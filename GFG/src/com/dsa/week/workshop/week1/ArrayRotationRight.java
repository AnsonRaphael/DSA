package com.dsa.week.workshop.week1;

public class ArrayRotationRight {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d=3;
        int k=d%arr.length;
        display(arr);
        rotateM3(arr,k);
        display(arr);
    }


    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }

    // time- O(N) Space-O(d)
    private static int[] rotateM1(int[] arr,int d){
        int m=0;
        int[] temp = new int[d];
        // copy last d index to temp
        for(int i=arr.length-d;i<arr.length;i++){
            temp[m++]=arr[i];
        }
        // shift d index to back
        for(int i=arr.length-1;i>=d;i--)
            arr[i]=arr[i-d];
        //copy temp value
        for(int i=0;i<d;i++)
            arr[i]=temp[i];

        return arr;
    }

    // time- O(nd) Space-O(1)
    private static int[] rotateM2(int[] arr,int d){
        int temp;
        for(int i=0;i<d;i++){
            temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }

    private static int[] rotateM3(int[] arr,int d){
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
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
