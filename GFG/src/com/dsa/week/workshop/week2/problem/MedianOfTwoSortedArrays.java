package com.dsa.week.workshop.week2.problem;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 2, m = 6;
//        int arr[] = {1,2,3,4,5};
//        int brr[] = {3,4,5,6,7,8};
        int arr[] = {415 ,635};
        int brr[] = {9, 40, 90, 170, 194, 271, 370, 447, 452, 457, 568, 681 ,772, 779, 794, 825, 834 ,887 ,1130 ,1154 ,1334 ,1443 ,1565 ,1676 ,2050 ,2081, 2085, 2111, 2193 ,2461 ,2534 ,2547 ,2616 ,2633 ,2661 ,2768, 2798, 2896, 2917 ,2934 ,2975 ,3064, 3091, 3297, 3309 ,3369, 3579, 3625, 3646, 3752, 3864, 4150 ,4162 ,4198, 4242 ,4253, 4260 ,4293 ,4398 ,4461 ,4519, 4932, 5026, 5115 ,5135, 5194 ,5499 ,5530 ,5541 ,5741, 5759, 5889 ,6013 ,6074 ,6223 ,6226 ,6521 ,6589 ,6594 ,6634 ,6759 ,6875 ,6895 ,7138 ,7190, 7204 ,7397 ,7413 ,7459 ,7514, 7527, 7616 ,7664 ,7755 ,7804 ,7940 ,8034 ,8068 ,8101 ,8124 ,8158, 8178, 8334};
        System.out.println(findMedian(arr,n,brr,brr.length));
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