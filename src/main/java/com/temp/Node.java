package com.temp;

public class Node {
    private  int data;
    private Node nextNode;

    Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNext() {
        return this.getNextNode();
    }
}
