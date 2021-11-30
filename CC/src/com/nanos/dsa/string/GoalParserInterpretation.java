package com.nanos.dsa.string;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command="G()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        int ln = command.length();
        StringBuilder sb = new StringBuilder(ln);
        for(int i=0;i<ln-1;i++){
            char c=command.charAt(i);
            if(c=='('){
                if(command.charAt(i+1)==')'){
                    sb.append("o");
                    i++;
                }else{
                    sb.append("al");
                    i=i+3;
                }
            }else if(c=='G'){
                sb.append("G");
            }
        }
        if(command.charAt(ln-1)=='G')
            sb.append("G");
        return sb.toString();

    }
}
