package com.mycompany.metroegypt.GraphImp;

import java.awt.color.ICC_Profile;

public class Edge<T> {
private Vertex<T> source;
private Vertex<T>destinations;
private double time;

    public Edge(Vertex<T> source, Vertex<T> destinations, double time) {
        this.source = source;
        this.destinations = destinations;
        this.time = time;
    }

    public Vertex<T> getDestination() {
    return destinations;
    }
}
