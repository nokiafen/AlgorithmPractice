package com.example.lib;

import java.util.Stack;

public class StackToQueue {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);


        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }

}
