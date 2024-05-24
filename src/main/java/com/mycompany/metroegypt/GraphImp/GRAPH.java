package com.mycompany.metroegypt.GraphImp;

import java.util.ArrayList;
import java.util.List;

public interface GRAPH<T> {
    final static String edgeType = "UNDIRECTED";

    public Vertex<T> createVertix(T data);

    public T getVertex(int index);
    public ArrayList<Vertex<T>> depthFirstSearch(Vertex<T> source) ;

    public int getSize();

    public List<T> getNeighbors(int index);

    List<T> getVertices();

    ArrayList<Edge<T>> getEdges(Vertex<T> source);

    void addUndirectedEdge(Vertex<T> source, Vertex<T> distination, Double time);

    void addDirectedEdge(Vertex<T> source, Vertex<T> distination, Double time);

    void add(String edgeType, Vertex<T> source, Vertex<T> destinations, double time);

    double timeMove(Vertex<T> source);

    public void printEdge();

    public void Clear();

  //  void addEdge(String edgeType, Vertex source, Vertex destinations, double time);
}
