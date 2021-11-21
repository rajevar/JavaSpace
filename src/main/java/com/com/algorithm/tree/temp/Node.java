package com.com.algorithm.tree.temp;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    List<Node> nodes;
    boolean isVisited;

    Node(int data ) {
        this.data = data;
        this.nodes = new ArrayList<>();
    }

    void addNeighbor(Node node) {
        this.nodes.add(node);
    }

    List<Node> getNeigbors() {
        return this.nodes;
    }
}
