package com.example.lib;

public class BinarySearch {
    public static void main(String[] args) {
        int [] sList =new int[]{1,3,5,9,10,11};
        System.out.println(binarySearch(sList,11));
    }

    private static int binarySearch(int[] sList,int target) {
        int left =0;
        int right =sList.length-1;
        int middle;
        int middleValue;
        while (left<=right){
             middle = left+((right-left)>>1);
             middleValue = sList[middle];
             if(middleValue<target){
                 left =middle+1;
             }else if(middleValue>target){
                 right=middle-1;
             }else {
                 return middle;
             }
        }

        return -1;


    }
}
