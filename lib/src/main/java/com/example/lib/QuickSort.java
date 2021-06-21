package com.example.lib;

import java.util.Arrays;
//快速排序
public class QuickSort {
    public static  void main (String [] args){

        int [] sArray = new int [] {0,3,1,5,9,10,9,1,2};
        fastSort(sArray,0,sArray.length-1);
        System.out.println(Arrays.toString(sArray));
    }

    private static void fastSort(int[] sArray, int l, int r) {

        if (l<=r) {
            int middle = l+((r-l)>>1);
            int middleValue = sArray[middle];
            int  [] bounds =centerSort(sArray,l,r,middleValue);
            fastSort(sArray,l,bounds[0]-1);
            fastSort(sArray,bounds[1]+1,r);
        }
    }

    private static int [] centerSort(int[] sArray, int l, int r, int middleValue) {
        int leftIndex =l;
        int rightIndex=r;

        while (l<=rightIndex){
            if (sArray[l]<middleValue) {
               swap(sArray,leftIndex++,l++);
            }else if(sArray[l]>middleValue){
                swap(sArray,l,rightIndex--);
            } else{
                l++;
            }
        }
        return new int[]{leftIndex,rightIndex};
    }

    private  static  void swap(int [] sArray,int a,int b){
        int temp =sArray[a];
        sArray[a]=sArray[b];
        sArray[b]=temp;
    }
}
