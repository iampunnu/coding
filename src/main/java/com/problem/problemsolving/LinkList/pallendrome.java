package com.problem.problemsolving.LinkList;


class pallendrome {

    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        String t="";
        for(int i=0;i<s.length();i++){
            if(        Character.isLetter(s.charAt(i))){
                t=t+Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(t);
        int i=0;int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;

    }
}