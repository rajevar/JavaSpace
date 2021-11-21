package com.com.algorithm.linked_list;

import com.com.algorithm.Node;

public class LinkedListTry {

    Node head;
    static int count, count2 = 0;
    Node headNode;
    Node headNode_;

    // Every new node become the head.
    void add(int number) {
        count++;
        Node newNode = new Node(number);
        if(head == null) {
            head = newNode;
            headNode_ = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Every new node is added at the end.
    // First node always remain the head.
    void append (int number) {
        count2++;
        Node newNode = new Node(number);
        if(head == null) {
            head = newNode;
            headNode = head;
        } else {
            head.next = newNode;
            head = newNode;
        }
    }

    void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    void printList2() {
        System.out.println(" -- ");
        while(headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }

    void remove2(int value) {
        if(headNode.data == value) {
            headNode = headNode.next;
        } else {
            head = headNode;
            while(head != null) {
                if(head.next != null && head.next.data == value) {
                    head.next = head.next.next;
                    break;
                }
                head = head.next;
            }
        }
    }

    void remove(int value) {

        if(head.data == value) {
            head = head.next;
        } else {
            Node obj = head;
            while(obj != null) {
                if(obj.next != null && obj.next.data == value) {
                    obj.next = obj.next.next;
                    break;
                }
                obj = obj.next;
            }
        }
    }

    void reverse() {
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void size() {
        System.out.println(count + " | " + count2);
    }

    public static void main(String[] args) {
        LinkedListTry ll = new LinkedListTry();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.printList();
        System.out.println(" ---- ");
        ll.reverse();
        ll.printList();

        ll.remove(10);


        LinkedListTry ll2 = new LinkedListTry();
        ll2.append(10);
        ll2.append(20);
        ll2.append(30);
        ll2.append(40);

        ll2.remove2(10);
        ll2.remove2(30);

        ll.printList();
        ll2.printList2();
        ll.size();

    }
}
