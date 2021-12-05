package com.nanos.dsa.string;

public class LongPressedName {
    public static void main(String[] args) {
        String name="zlexya";
        String typed="aazlllllllllllllleexxxxxxxxxxxxxxxya";
        System.out.println(isLongPressedName(name,typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        char[] namechar=name.toCharArray();
        char[] typedchar = typed.toCharArray();
        int j=0;
        for(int i=0;i<typedchar.length;){
            if(j<namechar.length&&namechar[j]==typedchar[i]){
                j++;
                i++;
            }else if(i>0&&typedchar[i-1]==typedchar[i]){
                while(i<typedchar.length&&typedchar[i-1]==typedchar[i])
                i++;
            }else{
                return false;
            }
        }
        if(j!=namechar.length){
            return false;
        }else{
            return true;
        }
    }
}
