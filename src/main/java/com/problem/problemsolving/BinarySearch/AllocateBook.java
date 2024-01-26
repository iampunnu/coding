package com.problem.problemsolving.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class AllocateBook {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        Integer[] otherList = new Integer[] {97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24};
        Collections.addAll(arrayList, otherList);
        System.out.println(books(arrayList,26));
    }

    public static int books(ArrayList<Integer> A, int B) {
        int mincap=Integer.MIN_VALUE;
        int maxcap=0;
        for(int i=0;i<A.size();i++){
            mincap= Math.max(mincap,A.get(i));
            maxcap=maxcap+A.get(i);

        }
        System.out.println(maxcap+" "+mincap);
        int ans=-1;
        // System.out.println(ans);

        // while (mincap<=maxcap){
        //     int m=(maxcap+mincap)/2;
        //     if(dys(A,m)==B){
        //        return m;               // System.out.println(ans);
        //     }
        //    else if(dys(A,m)>B){
        //         mincap=m+1;
        //     }

        //     else {
        //         maxcap=m-1;
        //     }
        // }
        // return ans;
        for(int i=mincap;i<=maxcap;i++){
            if(dys(A,i)==B){
                return i;
            }
        }
        return -1;

    }

    public static int dys(ArrayList<Integer> ship ,int cap){
        int days=1; int load=0;
        for(int i=0;i<ship.size();i++){

            load=load+ship.get(i);
            if(load>cap){
                days=days+1;
                load=ship.get(i);
            }
        }
        System.out.println("student "+days+" "+cap );
        return days;

    }
}
