package com.nanos.dsa.arrays.searching;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target ='j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int mid=0,low=0,high=letters.length-1;

        while (low<=high){
            mid=low+(high-low)/2;
            if(letters[mid]>target){
                res=letters[mid];
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return res;
    }
}
