package com.problem.problemsolving.Queue;

public class FirstNonrepeatingChar {
    public static void main(String[] args) {
        String s="abwhjabj";
        int arr[] =new int[256];
        for (int i=0;i<256;i++){
            arr[i]=-1;
        }
        for (int i=0;i<s.length();i++ ){
            if (arr[s.charAt(i)]==-1){
                arr[s.charAt(i)]=1;

            }
            else {
                arr[s.charAt(i)]=arr[s.charAt(i)]+1;
            }
        }
        for (int i=0;i<256;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<s.length();i++){
            if (arr[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
