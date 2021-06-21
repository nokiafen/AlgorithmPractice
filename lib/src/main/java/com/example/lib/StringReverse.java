package com.example.lib;

public class StringReverse {

    public static void main(String [] args){

        String normal = "abcdefghk";
        System.out.println(reverse(normal.toCharArray()));


    }

    private static String  reverse(char [] chars) {
        int leftIndex =0;
        int rightIndex =chars.length-1;
        while (leftIndex<rightIndex){

            swap(chars,leftIndex++,rightIndex--);
        }

        return  new String(chars);




    }

    private static void swap(char [] normal,int a,int b){
        char temp =normal[a];
        normal[a]=normal[b];
        normal[b]=temp;

    }

}
