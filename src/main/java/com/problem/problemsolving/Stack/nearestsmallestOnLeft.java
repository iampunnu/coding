package com.problem.problemsolving.Stack;

public class nearestsmallestOnLeft {
    public static void main(String[] args) {
        int a[]={5,2,8,10,12,6,1};
        int r[] =new int[a.length];
        r[0]=-1;
        for(int i=0;i<a.length;i++){
            boolean f=false;
            for (int j=i-1;j>=0;j--){
                if(a[i]>a[j]){
                    f=true;
                    r[i]=a[j];
                    break;
                }
            }
            if (!f){
                r[i]=-1;
            }
        }
        for (int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
