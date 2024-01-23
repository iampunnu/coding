package com.problem.problemsolving.Array.ArrayProblem;

public class TapWater {
    public static void main(String[] args) {

        int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        rightMax[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(rightMax[i]);
        }
        System.out.println();
        int ans=0;
        for (int i=0;i<arr.length;i++){
            ans=ans+Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        System.out.println(ans);



    }


}
