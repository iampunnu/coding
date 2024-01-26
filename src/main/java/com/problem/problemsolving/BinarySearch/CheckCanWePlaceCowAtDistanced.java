package com.problem.problemsolving.BinarySearch;

public class CheckCanWePlaceCowAtDistanced {
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        int k=3;
        System.out.println(checkcowwillbeplaced(arr,k,3));
        int l=1;
        int h=arr.length;
        int ans=-1;
        while (l<=h){
            int m=(l+h)/2;
            if(checkcowwillbeplaced(arr,k,m)){
                ans=m;
                l=m+1;
            }
            else {
                h=m-1;

            }
        }
        System.out.println(ans);

    }

    public static boolean checkcowwillbeplaced(int arr[],int k,int d){
        int cowplaced=1;
        int lastplacedIndex=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastplacedIndex]>=d){
                cowplaced=cowplaced+1;
                lastplacedIndex=i;
            }

            if (cowplaced==k){
              //  System.out.println(cowplaced);

                return true;}
        }
        //System.out.println(cowplaced);
        if (cowplaced==k){
            return true;}
        else {
            return false;}


    }
}
