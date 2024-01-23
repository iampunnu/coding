package com.problem.problemsolving.Array;

public class SubArrayPrefixSumEqiLibriam {
    public static void main(String[] args) {
        int ar[] = { 10,90, 50, 60, 80, 90,90,20,0,10 };
        for(int i=0;i<ar.length;i++){
            for (int j=i;j<ar.length;j++){
                for (int k=i;k<=j;k++){
                 //   System.out.print(ar[k]+" ");
                }
               // System.out.println();
            }
        }
        int pf[]= new int[10];
        pf[0]=ar[0];
        for(int i=1;i<ar.length;i++){
            pf[i]=pf[i-1]+ar[i];
        }
        for (int i=0;i<pf.length;i++){
            if ((pf[i]-pf[0]+ar[0])==(pf[ar.length-1]-pf[i]+ar[i])){
                System.out.println(i);
            }
        }

    }
}
