package com.coding;

import java.util.ArrayList;
import java.util.List;

class Vertex {
	char label;
    List<Vertex> childs;
    Vertex(char label) {
    	this.label = label;
    	childs = new ArrayList<>();
    }
    void addEdge(Vertex node) {
    	childs.add(node);
    }
}
