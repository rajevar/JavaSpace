package com.com.algorithm.tree;

import java.util.LinkedList;
import java.util.Stack;

// Depth First Search
public class DFS {
    Vertex root;
    Stack<Vertex> stack;
    DFS() {
        stack = new Stack<>();
    }
    void search(Vertex root) {
        stack.push(root);
        while(!stack.isEmpty()) {
            Vertex v = stack.pop();
            if(!v.visited) {
                System.out.print(v.data + " > ");
                v.visited = true;
            }
            for(Vertex node: v.getNeighbours()) {
                if(node!= null && !node.visited) {
                    stack.push(node);
                }
            }
        }
    }
    public static void main(String[] args) {

        Vertex node40 = new Vertex(40);
        Vertex node10 = new Vertex(10);
        Vertex node20 = new Vertex(20);
        Vertex node30 = new Vertex(30);


        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);

        DFS dfs = new DFS();
        dfs.search(node40);

    }
}
