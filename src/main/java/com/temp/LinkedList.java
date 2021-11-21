package com.temp;

public class LinkedList {

    Node rootNode;
    Node headNode;
    public void add(int value) {
        Node node = new Node(value);
        if(rootNode == null) {
            rootNode = node;
            headNode = node;
        } else {
            rootNode.setNextNode(node);
            rootNode = node;
        }
    }

    public void delete(int value) {
        // head gets deleted.
        if(headNode.getData() == value) {
            headNode = headNode.getNext();
            return;
        }

        Node node = headNode;
        Node tempNode = null;
        while(node != null) {
            if(node.getData() == value) {
                tempNode.setNextNode(node.getNextNode());
                break;
            }
            tempNode = node;
            node = node.getNext();
        }
    }

    public void printNodes() {
        Node node = headNode;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(50);
        linkedList.printNodes();
        System.out.println("----");
        linkedList.delete(50);
        linkedList.printNodes();

    }
}
