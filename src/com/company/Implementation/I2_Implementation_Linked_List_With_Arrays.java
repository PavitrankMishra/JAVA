package com.company.Implementation;

//8449404048
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
            if (size == 0) {
                head = tail = temp;
            } else {
                while (current.next != null) {
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
            while (current != null) {
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
            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            size++;
        }

        void removeLast() {
            Node current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
        }

        void removeFirst() {
            Node current = head;
            head = head.next;
            size--;
        }

        void removeAt(int idx) {
            Node prev = null;
            Node current = head;
            for (int i = 0; i < idx; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            size--;
        }

        int getFirst() {
            return head.data;
        }

        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }
            return current.data;
        }

        int getSize() {
            return size;
        }

        public Node getNodeAt(int idx) {
            Node current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }
            return current;
        }

        void reverse() {
            int l = 0;
            int r = size - 1;

            while (l < r) {
                Node ln = getNodeAt(l);
                Node rn = getNodeAt(r);
                int temp = ln.data;
                ln.data = rn.data;
                rn.data = temp;
                l++;
                r--;
            }
        }

        int kthFromEnd(int k) {
            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;
            }

            while (f != null) {
                s = s.next;
                f = f.next;
            }

            return s.data;
        }

        int mid() {
            Node s = head;
            Node f = head;
            while (f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }

            return s.data;
        }

        LinkedList getLinkedList(int[] arr) {
            LinkedList res = new LinkedList();
            for(int i:arr) {
                res.addLast(i);
            }
            return res;
        }

        LinkedList mergeTwoSortedLinkedList(LinkedList r1, LinkedList r2) {
            Node one = r1.head;
            Node two = r2.head;
            LinkedList res = new LinkedList();

            while(one != null && two != null) {
                int o = one.data;
                int t = two.data;

                if(o < t) {
                    res.addLast(o);
                    one = one.next;
                }else {
                    res.addLast(t);
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
        System.out.println();
        ll1.removeLast();
        ll1.printList();
        ll1.removeFirst();
        System.out.println();
        ll1.printList();

        System.out.println();
        ll1.removeAt(4);
        ll1.printList();

        System.out.println();
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

        System.out.println(ll1.getAt(4));
        System.out.println(ll1.getSize());

        ll1.reverse();
        ll1.printList();

        System.out.println();
        System.out.println(ll1.kthFromEnd(4));

        System.out.println(ll1.mid());

        int[] arr1 = new int[] {10,20,30,40,50};
        int[] arr2 = new int[] {7,9,12,35,55,60};

        LinkedList l2 = ll1.getLinkedList(arr1);
        LinkedList l3 = ll1.getLinkedList(arr2);

        LinkedList l5 = ll1.mergeTwoSortedLinkedList(l2,l3);
        l5.printList();
    }
}