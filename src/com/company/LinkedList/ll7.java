package com.company.LinkedList;

//KReverse a LinkedList

public class ll7 extends ll1{
    public static void main(String[] args) {
        LinkedList list7 = new LinkedList();
        list7.addLast(1);
        list7.addLast(2);
        list7.addLast(3);
        list7.addLast(4);
        list7.addLast(5);
        list7.addLast(6);
        list7.addLast(7);

        list7.show();

        list7.KReverse(2);

        list7.show();
    }
}
