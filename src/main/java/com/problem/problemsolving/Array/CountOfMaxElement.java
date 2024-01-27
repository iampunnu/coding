package com.problem.problemsolving.Array;


import org.beginsecure.domain.primitive.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class CountOfMaxElement {

    public static void main(String[] args) {
        int ar[] = { 10,90, 50, 60, 80, 90,90,1,9 };
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            Max=ar[i];
        }
        int count=0;
        for (int i=0;i<ar.length;i++){
            if (ar[i]==Max){
                count++;
            }
        }
        int n=111;
        for (int i=0;i<ar.length-1;i++){
            for (int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==n){
                    System.out.println("present");
                    break;
                }
            }
        }
        System.out.println(Max
                +" "+count);
    }
}
