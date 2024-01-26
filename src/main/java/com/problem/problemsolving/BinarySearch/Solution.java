package com.problem.problemsolving.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        Integer[] otherList = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        Collections.addAll(arrayList, otherList);
        System.out.println(solve(arrayList,12));

    }
    public static int solve(ArrayList<Integer> A, int B) {

        int l=0;int h=A.size()-1;
        int pivot=-1;
        while(l<=h){
            int m=(l+h)/2;
            if( A.get(m)>A.get(m+1) && A.get(m)>A.get(m-1)){
                pivot=m;
                break;

            }
            else  if( A.get(m)>A.get(m-1)){
                l=m+1;
            }
            else{
                h=m-1;
            }

        }
        System.out.println(pivot);

        int l1=0;int h1=pivot;
        while(l1<=h1){
            int m=(l1+h1)/2;
            if(A.get(m)==B){return m;}
            else if(A.get(m)<B){
                l1=m+1;
            }
            else{
                h1=m-1;
            }
        }
        int l2=pivot+1;int h2=A.size()-1;;
        while(l2<=h2){
            int m=(l2+h2)/2;
            if(A.get(m)==B){return m;}
            else if(A.get(m)<B){
                h2=m-1;
            }
            else{
                l2=m+1;
            }
        }
        return -1;


    }
}
