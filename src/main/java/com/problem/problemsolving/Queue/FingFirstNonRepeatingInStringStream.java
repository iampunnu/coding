package com.problem.problemsolving.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FingFirstNonRepeatingInStringStream {
    public static void main(String[] args) {
        String s="aaambncdefeg";

        Queue<Character> characters=new LinkedList<>();
        int arr[] =new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }

        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            characters.add(s.charAt(i));
            arr[s.charAt(i)-'a']++;
            while (!characters.isEmpty()){
                if (arr[ch-'a']>1){
                    characters.remove();
                }
                else {
                    System.out.print(characters.peek()+" ");
                    break;
                }
            }
            if (characters.isEmpty()){
                System.out.print(-1+" ");
            }
        }
    }
}
