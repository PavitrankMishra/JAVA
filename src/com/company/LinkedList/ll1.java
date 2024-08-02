package com.company.LinkedList;

public class ll1 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            temp.next = head;
            head = temp;
            size++;
        }

        void addAt(int val, int idx) {
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
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void removeFirst() {
            head = head.next;
            size--;
        }

        void removeAt(int idx) {
            Node current = head;
            for(int i=0;i<idx-1;i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
        void removeLast() {
            Node current = head;
            for(int i=0;i<size-2;i++) {
                current = current.next;
            }
            tail = current;
            current.next = null;
            size--;
        }

        int getFirst() {
            return head.data;
        }
        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node temp = head;
            for(int i=0;i<idx;i++) {
                temp = temp.next;
            }
            return temp.data;

        }
        void show() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        int getSize() {
            return size;
        }

        Node getNodeAt(int idx) {
            Node temp = head;
            for(int i=0;i<idx;i++) {
                temp = temp.next;
            }
            return temp;
        }
        void reverseDI() {
            int li = 0;
            int ri = size-1;
            while(li<ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(4);
        ll1.addLast(5);
        ll1.show();
        System.out.println("The size of the linkedlist is: " + ll1.getSize());
        ll1.addFirst(6);
        ll1.addFirst(7);
        ll1.addFirst(8);
        ll1.addFirst(9);
        ll1.addFirst(10);
        ll1.show();

        ll1.addAt(15, 4);
        ll1.show();
        System.out.println("The size of the linkedlist is: " + ll1.getSize());

        ll1.removeFirst();
        ll1.show();
        ll1.removeLast();
        ll1.show();

        ll1.removeAt(4);
        ll1.show();

        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.getAt(5));
    }
}
