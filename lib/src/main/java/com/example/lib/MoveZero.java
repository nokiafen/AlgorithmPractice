package com.example.lib;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {
        int[] sArray = new int[]{0, 1, 4, 9, 0, 10, 0};
        System.out.println(Arrays.toString(moveZero(sArray)));
    }

    private static int [] moveZero(int[] sArray) {
        int fullIndex = 0;
        int forIndex = 0;
        while (forIndex < sArray.length) {
            if (sArray[forIndex] != 0) {
                sArray[fullIndex] = sArray[forIndex];

                if(forIndex>fullIndex){
                    sArray[forIndex]=0;
                }
                forIndex++;
                fullIndex++;
            }else {
                forIndex++;
            }


        }
        return sArray;

    }

}
