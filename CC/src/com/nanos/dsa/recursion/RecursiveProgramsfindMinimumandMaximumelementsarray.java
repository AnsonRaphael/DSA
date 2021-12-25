package com.nanos.dsa.recursion;

public class RecursiveProgramsfindMinimumandMaximumelementsarray {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;

        // Function calling
        System.out.println(findMinRec(A, n));
        System.out.println(findMaxRec(A, n));
    }

    private static int findMinRec(int[] a, int n) {
        if(n==1)
            return a[0];
        return Math.min(a[n-1],findMinRec(a,n-1));
    }
    private static int findMaxRec(int[] a, int n) {
        if(n==1)
            return a[0];
        return Math.max(a[n-1],findMaxRec(a,n-1));
    }
}
