package com.com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    int data;
    boolean visited;
    List<Vertex> neighbours;

    Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addneighbours(Vertex neighbourVertex) {
        this.neighbours.add(neighbourVertex);
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }
}
