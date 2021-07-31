package com.dsa.week.workshop.week2;

public class FindRowNumberOfABinaryMatrixHavingMaximumNumberOf1s {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1},
                {0, 1, 1},
                {0, 0, 0}};
        findMax(arr);
    }

    static void findMax(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int j=col-1,sol=0,max=0;

        for (int i=0;i<row;i++){

            while (j>=0&&arr[i][j]==1){
                sol=i;
                max=j;
                j--;
            }
        }
        System.out.println("no of row "+(sol+1)+" max "+(col-max) );
    }
}
