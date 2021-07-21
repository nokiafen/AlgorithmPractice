package com.example.lib;

import java.util.Stack;

public class LinkNodeReverse {

    static class ListNode{
        ListNode next;
        int value;
        ListNode(int value){
            this.value =value;
        }

    }

    public static void main(String [] args){

       ListNode listNode1 = new ListNode(1);
       ListNode listNode2 = new ListNode(2);
       ListNode listNode3= new ListNode(3);
       listNode1.next =listNode2;
       listNode2.next=listNode3;


        Stack<ListNode> stack = new Stack<>();
        ListNode currentNode =listNode1;
        while (currentNode!=null){
            stack.push(currentNode);
            currentNode=currentNode.next;
        }

        ListNode startNode = stack.pop();
        ListNode newNode= startNode;
        while (!stack.isEmpty()){
          ListNode temp =stack.pop();
          newNode.next=temp;
          newNode=temp;
        }
        newNode.next=null;

        while (startNode.next!=null){
            System.out.println(startNode.value);
            startNode=startNode.next;
        }

        System.out.println(startNode.value);



    }

}
