package com.mycompany.metroegypt.GraphImp;

public class Vertex <T> {
    private int index;
    private T data;

    public Vertex(int index, T data) {
        this.index = index;
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
