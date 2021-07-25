package com.dsa.week.workshop.week1.array.problems;

public class WhoHasTheMajority {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8};
       int x = 1, y = 7 ,N = 8;
       System.out.println(majorityWins(arr,N,x,y));
    }
    public static int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int result=0;
        int cx=0,cy=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                cx++;
            if(arr[i]==y)
                cy++;

        }
        if(cy>cx){
            result=y;
        }else if(cx>cy){
            result=x;
        }else {
            if(x<y)
                result=x;
            else
                result=y;

        }
        return result;
    }
}
