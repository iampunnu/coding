package com.problem.problemsolving.Stack;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        System.out.println(infixToPostfix(exp));

    }

    public static int prec(char c) {
        switch (c) {

            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String exp){
        String result=new String("");
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<exp.length();i++){
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(exp.charAt(i))){
                result=result+exp.charAt(i);
            }
            else if (c == '('){
                stack.push(c);
            }
            else if (c == ')') {
                    while (!stack.isEmpty()
                            && stack.peek() != '(') {
                        result += stack.pop();
                    }

                    stack.pop();
                }
          else {
                while (!stack.isEmpty()
                        && prec(c) <= prec(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

}
