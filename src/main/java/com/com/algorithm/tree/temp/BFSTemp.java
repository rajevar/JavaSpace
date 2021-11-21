package com.com.algorithm.tree.temp;

import com.com.algorithm.tree.BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTemp {
    Node root;

    BFSTemp(Node node) {
        this.root = node;
    }

    void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node vertex = queue.remove();
            List<Node> nodes = vertex.getNeigbors();
            System.out.print(vertex.data + " > ");
            for(Node node: nodes) {
                if(!node.isVisited) {
                    queue.add(node);
                }
            }
        }
    }
    public static void main(String[] args) {

        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        node10.addNeighbor(node20);
        node10.addNeighbor(node50);
        node10.addNeighbor(node30);
        node20.addNeighbor(node40);
        BFSTemp bfs = new BFSTemp(node10);
        bfs.bfs();

    }
}
