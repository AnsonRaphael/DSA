package com.dsa.week.workshop.week1.array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[]={1 ,3 ,4 ,6};
        int b[]={2 ,5 ,7, 8};
        display(mergeArray(a,b));
    }
    public static int[] mergeArray(int[] a,int[] b){
        int al=a.length;
        int bl=b.length;
        int [] c = new int[al+bl];
        for (int i=0,j=0,k=0;k<(al+bl);k++){
            if(i>=al){
                c[k]=b[j];
                j++;
            }else if(j>=bl){
                c[k]=a[i];
                i++;
            }else{
                if(a[i]<b[j]){
                    c[k]=a[i];
                    i++;
                }else {
                    c[k]=b[j];
                    j++;
                }
            }

        }
        return c;
    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
