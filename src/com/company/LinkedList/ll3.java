package com.company.LinkedList;

//kthFromEnd

public class ll3 extends ll1{
    public static void main(String[] args) {
        LinkedList list2 = new LinkedList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        System.out.println("The 3rd element from the end is: " + list2.kthFromEnd(3));


    }
}
