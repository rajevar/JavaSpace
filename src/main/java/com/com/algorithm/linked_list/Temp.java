package com.com.algorithm.linked_list;

import com.com.algorithm.Node;

public class Temp {
    Node head;
    void addAll(int arr[]){
        for(int item: arr) {
            add(item);
        }
    }

    void add(int number){
        Node newNode = new Node(number);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void append(int number) {
        Node newNode = new Node(number);
        if(head == null) {
            head = newNode;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
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

    void delete(int number) {
        System.out.println("head data ? " + head.data);
        Node n = head;
        while(n.next != null) {
            if(n.next.data == number) {
                n.next = n.next.next;
            }
            n = n.next;
        }
    }

    void printNodes() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    static Temp merge(Temp list1, Temp list2) {
        Temp merged = null;

        return merged;
    }

    public static void main(String[] args) {
        Temp t = new Temp();
        t.add(10);
        t.add(20);
        t.add(30);
        t.addAll(new int[]{40,41,33});
        t.append(5);
        t.printNodes();
        t.delete(20);
        t.reverse();;
        t.printNodes();

        Temp list1 = new Temp();
        list1.addAll(new int[]{1, 3, 5, 6});
        Temp list2 = new Temp();
        list2.addAll(new int[]{2, 4, 6, 20, 34});
        merge(list1,list2);

    }
}
