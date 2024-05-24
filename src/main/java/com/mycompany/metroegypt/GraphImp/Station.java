package com.mycompany.metroegypt.GraphImp;

public class Station {
    private String name;
    private int stationInLine ;
    private boolean converterType ;

    public Station(String name, int stationInLine, boolean converterType) {
        this.name = name;
        this.stationInLine = stationInLine;
        this.converterType = converterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStationInLine() {
        return stationInLine;
    }

    public void setStationInLine(int stationInLine) {
        this.stationInLine = stationInLine;
    }

    public boolean isConverterType() {
        return converterType;
    }

    public void setConverterType(boolean converterType) {
        this.converterType = converterType;
    }
}
