package com.nanos.dsa.arrays.searching.binaryleetcode;

public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        /*int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3},
        };*/
        int[][] grid={
                {5,1,0},
                {-5,-5,-5},

        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int lims=grid.length,lime=grid[0].length,sum=0,cl=lime,rw=lims;
        for(int i=0;i<rw;i++){
            for(int j=0;j<lime;j++){
                if(grid[i][j]<0){
                    sum+=(lime-j)*(rw-i);
                    System.out.println(+lime+" "+j+" "+" "+rw+" "+i+" "+sum);
                    lime=j;
                    break;
                }
            }
        }
        return sum;
    }
}
