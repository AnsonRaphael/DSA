package com.dsa.week.workshop.week1.array.problems;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
       int n = 5;
        int arr[] = {0,-10,1,3,-20};
        System.out.println(findMissing4(arr,n));
    }
/* Method 1
* Space O(n)
* Time O(n)                            */
    static int findMissing1(int arr[], int size){
        // Your code here
        int j=segragate(arr,size);
        int arr2[] = new int[size-j];
        int k=0;

        for(int i=j;i<size;i++){
            arr2[k]=arr[i];
            k++;
        }
        return findMissingPositive(arr2,k);
    }

    //separate negative number
    static int segragate(int arr[],int n){
        int j=0;
        for (int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }

    static int findMissingPositive(int[] arr, int n){

        for (int i=0;i<n;i++){
            int x = Math.abs(arr[i]);
            if((x-1)>=0&&(x-1)<n&&arr[x-1]>0){
                arr[x-1]=-arr[x-1];
            }
        }
        int result=n+1;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                result=i+1;
            }
        }
        return result;
    }


    /*Method 2 similar space and time complexity */
    static int findMissing2(int arr[], int size){

        boolean check[] = new boolean[size+1];

        for (int i=0;i<size;i++){

            if(arr[i]>0&&arr[i]<=size){
                check[arr[i]]=true;
            }
        }

        for (int i=1;i<=size;i++){
            if (!check[i]){
                return i;
            }
        }
        return  size+1;
    }

    /*arr is alterd time O(n) Space O(1)*/
    static int findMissing3(int arr[], int size){
        int ptr = 0;
        // Check if 1 is present in array or not
        for(int i = 0; i < size; i++){
            if (arr[i] == 1){
                ptr = 1;
                break;
            }
        }
        // If 1 is not present
        if (ptr == 0)
            return (1);
        for (int i=0;i<size;i++){
            if(arr[i]<=0||arr[i]>size){
                arr[i]=1;
            }
        }
        for (int i=1;i<size;i++){
           arr[(arr[i]-1)%size]+=size;
        }
        for (int i=0;i<size;i++){
            if (arr[i]<=size){
                return i+1;
            }
        }
        return  size+1;
    }

    /*re arrgane array Space O(1) and time O(n) */
    static int findMissing4(int arr[], int size){

        for (int i=0;i<size;i++){
            while (arr[i]>=1&&arr[i]<=size&&arr[i]!=arr[arr[i]-1]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }

        for (int i=0;i<size;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return size+1;
    }
}
