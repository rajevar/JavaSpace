package com.com.algorithm.bfs;
// random linkedlist refreshment
public class MyNode {
    MyNode nextNode;
    int value;

    MyNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    MyNode addNode(int value) {
        MyNode newNode = new MyNode(value);
        this.nextNode = newNode;
        return newNode;
    }
}

// 0 -> 1 -> 2 -> null;
// 0 -> null
class MyLL {
    public static void main(String[] args) {
        MyNode root = new MyNode(0);
        root.addNode(1);


    }
}
