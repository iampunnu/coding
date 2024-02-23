package com.problem.problemsolving.Array.twopointer;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }


    }

    public static void sort(int a[],int l,int r){

        if(l<r){
            int p=partition(a,l,r);
            sort(a,l,p-1);
            sort(a,p+1,r);
        }

    }
    public static int  partition(int a[],int l,int r){
              int pivot=a[r];
              int i=l-1;
              for (int j=l;j<r;j++){

                  if (a[j]<pivot){
                      i++;
                      swap(a,i,j);
                  }
              }
              swap(a,i+1,r);
              return i+1;
    }
    public static void swap(int a[],int first,int second){
        int swap=a[first];
        a[first]=a[second];
        a[second]=swap;

    }
}
