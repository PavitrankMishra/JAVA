package com.company.LinkedList;

//OddEven LinkedList

public class ll6 extends ll1{
    public static void main(String[] args) {
        LinkedList list6 = new LinkedList();
        list6.addLast(1);
        list6.addLast(3);
        list6.addLast(4);
        list6.addLast(5);
        list6.addLast(6);

        list6.show();

        list6.OddEven();

        list6.show();
    }
}
