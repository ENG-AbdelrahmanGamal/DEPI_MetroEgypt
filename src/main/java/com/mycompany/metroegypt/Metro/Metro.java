package com.mycompany.metroegypt.Metro;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Metro {
    int getNumberVertex();
    void getPriceOfJourney();
    void getTimeOfJourney();
    void addVertex(String v);

  void addEdge(String s,String d);
  List<String>BFS(String start,String end);
    void DFS(String start, String end, Set<String> visited, List<String> path, List<List<String>> paths);
public  String getDirection(String[] line1Stations,
                            String[] line2Stations,
                            String[] line3Stations,
                            String start, String end);
void addEdgesByLine(Graph g, String[]line);
    List<String> shortPath(Map<String, String> parent, String start, String end);
    public int numberOfAdjacent(String station);
}
