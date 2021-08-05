package com.dsa.week.workshop.week2.problem;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 2, m = 6;
        int arr[] = {1,2,3,4,5};
        int brr[] = {3,4,5,6,7,8};
        System.out.println(findMedian(arr,n,brr,m));
    }
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here
        int med1=0,med2=0;
        int med1dx=-1,med2dx=-1;
        boolean evn=false;
        med1dx=(m+n)/2;
        if((m+n)%2==0){
            evn=true;
            med2dx=((m+n)/2)-1;

        }
        int i=0,j=0,indx=0,prev=0;
        for (;i<n&&j<m;){
             if (arr[i]<=brr[j]){
                indx=i+j;
                if(med1dx==indx){
                    med1=arr[i];
                    med2=prev;
                    break;
                }
                prev=arr[i];
                i++;
            }else {
                indx=i+j;
                if(med1dx==indx){
                    med1=brr[j];
                    med2=prev;
                    break;
                }
                prev=brr[j];
                j++;
            }
        }

        while (i<n){
            indx=i+j;
            if(med1dx==indx){
                med1=arr[i];
                med2=prev;
                break;
            }
            prev=arr[i];
            i++;
        }
        while (j<m){
            indx=i+j;
            if(med1dx==indx){
                med1=brr[j];
                med2=prev;
                break;
            }
            prev=brr[j];
            j++;
        }

        if(evn){
            return (med1+med2)/2;
        }else
            return med1;

    }
}

//
//if(arr[i]==brr[j]){
//        indx=i+j;
//        if(med1dx==indx){
//        med1=brr[j];
//        med2=prev;
//        break;
//        }
//        prev=brr[j];
//        i++;
//        j++;
//        }else