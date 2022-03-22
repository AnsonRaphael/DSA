package com.daily;

import java.util.HashMap;
import java.util.Stack;

public class MaximumFrequencyStack {
    static class FreqStack {
        HashMap<Integer, Stack<Integer>> freqStackMap;
        HashMap<Integer,Integer> valFreqMap;
        int maxFreq;

        public FreqStack() {
            freqStackMap = new HashMap<>();
            valFreqMap = new HashMap<>();
            maxFreq=0;
        }

        public void push(int val) {
           int freqFound=valFreqMap.getOrDefault(val,0);
           freqFound++;
           valFreqMap.put(val,freqFound);
           if(freqFound>maxFreq)
               maxFreq=freqFound;
           if(freqStackMap.containsKey(freqFound)){
               freqStackMap.get(freqFound).push(val);
           }else {
               Stack<Integer> nes= new Stack<>();
                nes.push(val);
               freqStackMap.put(freqFound,nes);
           }

        }

        public int pop() {
            Stack<Integer> popStack = freqStackMap.get(maxFreq);
            while(popStack.isEmpty()){
                maxFreq--;
                popStack = freqStackMap.get(maxFreq);
                if(maxFreq==0)
                    break;
            }
            int popVal= popStack.pop();
            valFreqMap.put(popVal,valFreqMap.get(popVal)-1);
            return popVal;
        }
    }

    public static void main(String[] args) {
        FreqStack stack = new FreqStack();
        stack.push(1);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
