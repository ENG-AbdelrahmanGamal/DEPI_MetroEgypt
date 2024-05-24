package com.mycompany.metroegypt.GraphImp;

import java.util.*;
import java.util.stream.Collectors;

public class AdjacentList<T> implements GRAPH {


    public HashMap<Vertex<T>, ArrayList<Edge<T>>> adjacencies = new HashMap<>();



    @Override
    public Vertex createVertix(Object data) {
        Vertex<T> vertex = new Vertex<T>(adjacencies.size(), (T) data);
        adjacencies.put(vertex, new ArrayList<>());
        return vertex;
    }

    @Override
    public Object getVertex(int index) {
        return adjacencies.get(index);
    }

    @Override
    public ArrayList<Vertex<T>> depthFirstSearch(Vertex source) {

            Stack<Vertex<T>> stack = new Stack<>();
            ArrayList<Vertex<T>> visited = new ArrayList<>();
            HashSet<Vertex<T>> pushed = new HashSet<>();
            stack.push(source);
            pushed.add(source);
            visited.add(source);
            // more to come ...
            return visited;

    }

    @Override
    public List<Integer> getNeighbors(int index) {
        return List.of();
    }

    @Override
    public List getVertices() {
        return new ArrayList<>(List.of(adjacencies.toString()));
    }

    @Override
    public int getSize() {
        return adjacencies.size();
    }

    @Override
    public void printEdge() {

    }

    @Override
    public void Clear() {

    }




    @Override
    public void addUndirectedEdge(Vertex source, Vertex distination, Double time) {
        addDirectedEdge(source, distination, time);
        addDirectedEdge(distination, source, time);
    }

    @Override
    public void addDirectedEdge(Vertex source, Vertex distination, Double time) {
        Edge<T> edge = new Edge<>(source, distination, time);
        if (adjacencies.containsKey(source)) {
            adjacencies.get(source).add(edge);
        }
    }

    @Override
    public void add(String edgeType, Vertex source, Vertex destinations, double time) {

    }

//    @Override
//    public void addEdge(String edgeType, Vertex source, Vertex destinations, double time) {
//        addUndirectedEdge(source, destinations, time);
//
//    }

    @Override
    public ArrayList<Edge> getEdges(Vertex source) {
        return null;
    }

    @Override
    public double timeMove(Vertex source) {
        return 0;
    }
    @Override public String toString()
    {
        StringBuilder builder = new StringBuilder();
        adjacencies.forEach((vertex, edges) -> {
            String edgeString = edges.stream()
                    .map(edge -> edge.getDestination().getData().toString())
                    .collect(Collectors.joining(", "));
            builder.append(vertex.getData())
                    .append(" ---> [ ")
                    .append(edgeString.toString())
                    .append(" ]\n");
        });
        return builder.toString();
    }
//@Override public String toString()
//{
//    StringBuilder builder = new StringBuilder();
//
//    for (Vertex v : adjacencies.keySet()) {
//        builder.append(v.toString() + ": ");
//        for (Edge w : adjacencies.get(v)) {
//             builder.append("( "+w.toString() + " )");
//        }
//        builder.append("\n");
//    }
//
//    return (builder.toString());
//}
}
