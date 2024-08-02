package com.company.LinkedList;

// Middle of LinkedList

public class ll4 extends ll1{
    public static void main(String[] args) {
        LinkedList list4 = new LinkedList();
        list4.addLast(1);
        list4.addLast(2);
        list4.addLast(3);
        list4.addLast(4);
        list4.addLast(5);
        list4.addLast(6);

        list4.show();

        System.out.println(list4.middleOfLinkedList());
    }
}
