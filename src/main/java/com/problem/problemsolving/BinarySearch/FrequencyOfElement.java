package com.problem.problemsolving.BinarySearch;

public class FrequencyOfElement {
    public static void main(String[] args) {
        FirstOccurence firstOccurence=new FirstOccurence();
        int arr[]={1,2,2,2,2,2,2,2,9};
        int t=2;
        int first=firstOccurence.first(arr,0,arr.length-1,t,true);
        int last=firstOccurence.first(arr,0,arr.length-1,t,false);
        System.out.println(first+" "+last);

    }
}
