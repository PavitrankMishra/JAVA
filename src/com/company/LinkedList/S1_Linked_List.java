package com.company.LinkedList;

import java.util.LinkedList;

public class S1_Linked_List {
    static class Node{
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size == 0) {
                head = tail = temp;
            }else {
                Node current = head;
                while(current.next != null) {
                    current = current.next;
                }
                current.next = temp;
                tail = temp;
            }
            size++;
        }

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            size++;
        }

        void addAt(int idx, int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            Node current = head;
            for(int i=0;i<idx-1;i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            size++;
        }

        void removeFirst() {
            Node current = head;
            head = head.next;
            size--;
        }

        void removeLast() {
            Node current = head;
            for(int i=0;i<size - 2;i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
        }

        void removeAt(int idx) {
            Node prev = null;
            Node current = head;
            for(int i=0;i<idx;i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            size--;
        }

        void printList() {
            Node current =  head;
            while(current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(4);
        ll1.addLast(5);
        ll1.addLast(6);
        ll1.addLast(7);
        ll1.addLast(8);
        ll1.addLast(9);
        ll1.printList();

        ll1.addFirst(10);

        System.out.println();
        ll1.printList();

        ll1.addAt(4,50);

        System.out.println();
        ll1.printList();

        ll1.removeFirst();

        System.out.println();
        ll1.printList();

        ll1.removeLast();

        System.out.println();
        ll1.printList();

        ll1.removeAt(5);

        System.out.println();
        ll1.printList();
    }
}
