package com.problem.problemsolving.numberSystem;

public class BitManupulation {
    public static void main(StringT[] args) {

        String r="sskfssbbb9bbb";
       // System.out.println(r.substring(2,4));

        for (int i=2;i<=r.length()/2;i++){

               for (int j=0;j<r.length()-i;j++){
                   String sub=r.substring(j,j+i);
                   System.out.println(sub+" "+i+" "+j);

            for (int k=i+j;k<r.length()-j; k++) {
                String sub1= sub.substring(k,k+j);
                System.out.println(sub1+" "+i+" "+j+" "+k);

                if (sub.equals(sub1)){
                    System.out.println(sub);
                }

            }
               }

        }
    }
}
