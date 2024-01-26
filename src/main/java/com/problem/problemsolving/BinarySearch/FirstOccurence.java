package com.problem.problemsolving.BinarySearch;

public class FirstOccurence {

    public int first(int a[],int l,int h,int t,boolean start){
        int ans=-1;
        while (l<=h){
            int m=(l+h)/2;
            if(a[m]<t){
                l=m+1;
            }
            else if(a[m]>t){
                h=m-1;
            }
            else {
                ans=m;

                if (start){
                    h=m-1;
                }
                else {
                    l=m+1;
                }

            }
        }
        return ans;

    }

}
