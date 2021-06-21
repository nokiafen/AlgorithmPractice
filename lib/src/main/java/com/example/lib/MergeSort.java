package com.example.lib;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] sList =new int[]{3,0,5,1,6,2,8,2,10};
        mergeSort(sList,0,sList.length-1);
        System.out.println(Arrays.toString(sList));
    }

    private static void mergeSort(int[] sList,int l,int r) {
        if (l<r) {
            int middle = l+((r-l)>>1);
            mergeSort(sList,l,middle);
            mergeSort(sList,middle+1,r);
            mergeChild(sList,l,r,middle);
        }
    }

    private static void mergeChild(int[] sList, int l, int r, int middle) {
        int leftIndex = l;
        int rightIndex = middle+1;
        int [] temp = new int[r-l+1];
        int tempIndex=0;
        while (leftIndex<=middle&&rightIndex<=r){
            temp[tempIndex++]=sList[leftIndex]>sList[rightIndex]?sList[rightIndex++]:sList[leftIndex++];
        }

        while (leftIndex<=middle){
            temp[tempIndex++]=sList[leftIndex++];
        }

        while (rightIndex<=r){
            temp[tempIndex++]=sList[rightIndex++];
        }

        for (int i = 0; i < temp.length; i++) {
            sList[i+l]=temp[i];
        }

    }
}
