package com.temp;

public class MyList {
    MyNode head;
    MyNode root;
    void add(int data) {
        MyNode node = new MyNode(data);
        if(head == null) {
            head = node;
            root = head;
        } else {
            node.next = head;
            head = node;
        }
    }

    void delete(int val) {
        MyNode temp = head;
        if(head.data == val) {
            head = head.next;
        } else {
            while (temp.next != null) {
                if (temp.next.data == val) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    void print() {
        MyNode temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.delete(10);
        list.print();

    }
}
