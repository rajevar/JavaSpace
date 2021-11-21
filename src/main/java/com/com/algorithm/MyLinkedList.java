package com.com.algorithm;

public class MyLinkedList {
    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void remove(int data){
        if(head.data == data) {
            head = head.next;
            return;
        } else {
            Node obj = head;
            while( obj != null) {
                if (obj.next != null && obj.next.data == data) {
                    obj.next = obj.next.next;
                    break;
                }
                obj = obj.next;
            }
        }
    }

    void append(int data) {
        Node node = head;
        // find the last node with next is null
        while(node.next != null) {
            node = node.next;
        }
        Node newNode = new Node(data);
        node.next = newNode;
       // node = newNode;
    }

    void myAppend(int data) {
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = new Node(data);
    }

    void printList() {
        Node headNode = head;
        while(headNode != null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(4);
        linkedList.printList();
        System.out.println();

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        linkedList.append(6);
//        linkedList.push(7);
//        linkedList.myAppend(10);
//        linkedList.myAppend(20);
        linkedList.printList();
        System.out.println();
        linkedList.remove(61);
        linkedList.printList();
    }
}
