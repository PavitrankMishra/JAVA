package com.company.Implementation;

public class I2_Implementation_Linked_List_With_Arrays {
    static class Node {
        int data;
        Node next;
    }
     static class LinkedList {
        Node head;
        Node tail;
        int size;

         void addLast(int data) {
             Node current = head;
             Node temp = new Node();
             temp.data = data;
             temp.next = null;
             if(size == 0) {
                 head = tail = temp;
             }else {
                 while(current.next != null) {
                     current = current.next;
                 }
                 current.next = temp;
                 tail = temp;
             }
             size++;
         }

         void addFirst(int data) {
             Node temp = new Node();
             temp.data = data;
             temp.next = null;
             temp.next = head;
             head = temp;
             size++;
         }

         void printList() {
             Node current = head;
             while(current != null) {
                 System.out.print(current.data + "->");
                 current = current.next;
             }
             System.out.print("null");
         }

         void addAt(int idx, int data) {
             Node temp = new Node();
             temp.data = data;
             temp.next = null;
             Node current = head;
             for(int i=0;i<idx-1;i++) {
                 current = current.next;
             }
             temp.next = current.next;
             current.next = temp;
             size++;
         }
    }



    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(0);
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(4);
        ll1.addLast(5);
        ll1.addLast(6);
        ll1.addLast(7);
        ll1.addLast(8);
        ll1.addLast(9);
        ll1.addFirst(12);
        ll1.addAt(5, 45);
        ll1.printList();
    }
}
