package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CSortItOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        int[] copyArray = new int[n];
        // store input array in array and copy array in copyArray
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            array[i] = num;
            copyArray[i] = num;
        }
        boolean isSwappped ;
        boolean isSame = true;
        //sort using bubblesort
        for (int i = 0; i < n; i++) {
            isSwappped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSwappped = true;
                    isSame = false;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (!isSwappped) {
                break;
            }
        }
        if (isSame) {
            for (int i = 0; i < n; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i] == copyArray[j]) {
                        System.out.print(j + " ");
                        // reset already found data
                        copyArray[j] = -1;
                    }
                }
            }
        }
    }
}
