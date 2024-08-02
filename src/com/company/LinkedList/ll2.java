package com.company.LinkedList;

//Reverse a Linked List

public class ll2 extends ll1{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.show();

        list.reverseDI();

        list.show();
    }
}
