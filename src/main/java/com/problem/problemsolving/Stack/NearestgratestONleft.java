package com.problem.problemsolving.Stack;

import java.util.Stack;

public class NearestgratestONleft {
    public static void main(String[] args) {
        int arr[]={5,2,8,10,12,6,1};
        int ans[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<arr.length;i++){
            while (stack.size()>0 && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if (stack.size()==0){
                ans[i]=-1;
            }
            else {ans[i]=stack.peek();}
            stack.push(i);
        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
