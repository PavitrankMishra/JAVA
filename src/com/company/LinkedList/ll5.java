package com.company.LinkedList;

public class ll5 extends ll1{
    public static void main(String[] args) {
        LinkedList list5 = new LinkedList();
        list5.addLast(12);
        list5.addLast(12);
        list5.addLast(13);
        list5.addLast(14);
        list5.addLast(15);
        list5.addLast(15);
        list5.addLast(15);

        list5.show();

        list5.removeDuplicates();

        list5.show();
    }
}
