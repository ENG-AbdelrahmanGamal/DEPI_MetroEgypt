package com.mycompany.metroegypt.Metro;

import java.util.List;

public interface Metro {
    int getNumberVertex();
    void getPriceOfJourney();
    void getTimeOfJourney();
    void addVertex(String v);

  void addEdge(String s,String d);
  List<String>BFS(String start,String end);
public  String getDirection(String[] line1Stations,
                            String[] line2Stations,
                            String[] line3Stations,
                            String start, String end);
void addEdgesbyLine(Graph g, String[]line);


}
