package com.problem.problemsolving.String;

public class kmpNaive {

    public static void main(String args[])
    {String pat = "ABABACBCABABACBCABABACBC";
        String txt = "ABABAC";
        // Function call
        search(pat, txt);
        search1(txt,pat);
    }
    static void search1(String pat,String txt){
        int patl=pat.length();
        int txtl=txt.length();
        for (int i=0;i<txtl;i++){
            int k=i;
            int l=0;
            while (l<patl && k<txtl){
                if(pat.charAt(l)==txt.charAt(k)){
               //     System.out.println(k+" "+l+" "+i);
                    l++;k++;
                }
                else break;;
            }
            if(l==patl){
                System.out.println("pattern found at "+i);
            }

        }

    }

    static void search(String pat, String txt)
    {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;

        for (i = 0, j = l2 ; j < l1;) {

            if (txt.equals(pat.substring(i, j ))) {
                System.out.println("Pattern found at index "
                        + i);
            }
            i++;
            j++;
        }
    }
}
