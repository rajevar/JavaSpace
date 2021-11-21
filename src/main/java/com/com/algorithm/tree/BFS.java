package com.com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// BFS with queue
public class BFS {
    private Queue<Vertex> queue;
    public BFS() {
        queue = new LinkedList<Vertex>();
    }

    public void bfs(Vertex node) {
        queue.add(node);
        node.visited = true;

        while (!queue.isEmpty()) {
            Vertex element = queue.remove();
            System.out.print(element.data + " - ");
            List<Vertex> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Vertex n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            } }
    }

    public static void main(String arg[]) {

        Vertex node40 = new Vertex(40);
        Vertex node10 = new Vertex(10);
        Vertex node20 = new Vertex(20);
        Vertex node30 = new Vertex(30);
        Vertex node60 = new Vertex(60);
        Vertex node50 = new Vertex(50);
        Vertex node70 = new Vertex(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        BFS bfsExample = new BFS();
        bfsExample.bfs(node40);

    }
}