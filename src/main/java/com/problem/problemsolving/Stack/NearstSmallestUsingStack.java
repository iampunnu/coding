package com.problem.problemsolving.Stack;
import java.util.Stack;

public class NearstSmallestUsingStack {
    public static void main(String[] args) {

        int arr[]={5,2,8,10,12,6,1};
        int ans[]=new int [arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else {
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

}
