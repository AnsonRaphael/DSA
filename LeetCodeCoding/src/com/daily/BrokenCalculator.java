package com.daily;

public class BrokenCalculator {
    public static void main(String[] args) {
        int startValue=2;
        int target=3;
        System.out.println(brokenCalc(startValue,target));
    }
    public static int brokenCalc(int startValue, int target) {
        if(target<startValue)
            return startValue-target;
        if(target==startValue)
            return 0;
        int ans=0;
        if(target>0&&target%2==0)
            ans=1+brokenCalc(startValue,target/2);
        else
            ans=1+brokenCalc(startValue,target+1);
        return ans;
    }

}
