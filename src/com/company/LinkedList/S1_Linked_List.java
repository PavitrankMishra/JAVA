package com.company.LinkedList;

import java.util.Arrays;
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

        int getFirst() {
            return head.data;
        }

        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node current = head;
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            return current.data;
        }

        public Node getNodeAt(int idx) {
            Node temp = head;
            for(int i=0;i<idx;i++) {
                temp = temp.next;
            }
            return temp;
        }

        void reverse() {
            int l = 0;
            int r = size-1;

            while(l<r) {
                Node left = getNodeAt(l);
                Node right = getNodeAt(r);

                int temp  = left.data;
                left.data = right.data;
                right.data = temp;
                l++;
                r--;
            }
        }

        int kthFromEnd(int k) {
            Node s = head;
            Node f = head;
            for(int i=0;i<k;i++) {
                f = f.next;
            }

            while(f != null) {
                s = s.next;
                f = f.next;
            }

            return s.data;
        }

        int mid() {
            Node s = head;
            Node f = head;
            while(f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }

            return s.data;
        }

        public static LinkedList getLinkedList(int[] arr) {
            LinkedList list = new LinkedList();
            for(int itr: arr) {
                list.addLast(itr);
            }
            return list;
        }
        public static LinkedList mergeTwoSortedLinkedList(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList res=  new LinkedList();

            while(one != null && two != null) {
                if(one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while(one != null) {
                res.addLast(one.data);
                one = one.next;
            }

            while(two != null) {
                res.addLast(two.data);
                two = two.next;
            }
            return res;
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


        System.out.println();
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.getAt(5));

        ll1.reverse();
        ll1.printList();

        System.out.println();
        System.out.println(ll1.kthFromEnd(5));

        System.out.println();
        System.out.println("The middle element is: " + ll1.mid());

        int[] arr1 = new int[] {10,20,30,40,50};
        int[] arr2 = new int[] {7,9,12,35,55,60};

        LinkedList l2 = ll1.getLinkedList(arr1);
        LinkedList l3 = ll1.getLinkedList(arr2);

        LinkedList l4 = ll1.mergeTwoSortedLinkedList(l2,l3);

        System.out.println();
        l4.printList();
    }
}
