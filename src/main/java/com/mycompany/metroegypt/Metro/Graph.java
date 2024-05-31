package com.mycompany.metroegypt.Metro;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Graph implements Metro {
    private Map<String, List<String>> adjacencyList;
    List<String> path;


    public Graph() {
        this.adjacencyList = new HashMap<>();
    }


    @Override
    public int getNumberVertex() {
        int size = adjacencyList.keySet().size();
        System.out.println("the graph has " + size + " Vertex");
        return size;
    }

    @Override
    public void getPriceOfJourney() {
        if (path.contains("")) System.out.println("Ticket price  No pounds");
        else if (path.size() <= 9) {
            System.out.println("Ticket price  6 pounds");
        } else if (path.size() > 9 && path.size() <= 16) {
            System.out.println("Ticket price  8 pounds");
        } else if (path.size() > 16 && path.size() <= 23) {
            System.out.println("Ticket price 12 pounds");
        } else {
            System.out.println("Ticket price 15 pounds");
        }
    }

    @Override
    public void getTimeOfJourney() {
        int time = path.size() * 2;

        if (path.contains("")) time = 0;

        int minutes = (time * 2);
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(String.format("It’s approximately %02d:%02d", hours, remainingMinutes) + " :minutes");

    }

    @Override
    public void addVertex(String v) {
        adjacencyList.put(v, new ArrayList<String>());
    }

    @Override
    public void addEdge(String s, String d) {
        if (!adjacencyList.containsKey(s)) adjacencyList.putIfAbsent(s, new ArrayList<>());
        if (!adjacencyList.containsKey(d)) adjacencyList.putIfAbsent(d, new ArrayList<>());

        adjacencyList.get(s).add(d);
        adjacencyList.get(d).add(s);
    }


    @Override
    public List<String> BFS(String start, String end) {
        Map<String, Boolean> visited = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();

        visited.put(start, true);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(end)) {
                return allPath(parent, start, end);
            }

            for (String neighbor : adjacencyList.getOrDefault(current, new ArrayList<>())) {
                if (!visited.getOrDefault(neighbor, false)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                    parent.put(neighbor, current);
                }
            }
        }
        return Collections.emptyList();
    }

    public Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (String v : adjacencyList.keySet()) {
                    stack.push(vertex);
                }
            }
        }
        return visited;
    }

    public LinkedList<String> adjacentVertex(String last) {
        LinkedHashSet<String> adjacente = new LinkedHashSet(Arrays.asList(adjacencyList.get(last)));
        System.out.println("adjacentes:" + adjacente);
        if (adjacente == null) {
            return new LinkedList<String>();
        }
        return new LinkedList<String>(adjacente);
    }

    @Override
    public String getDirection(String[] line_1, String[] line_2, String[] line_3, String start, String end) {
        List<String> line1 = Arrays.asList(line_1);
        List<String> line2 = Arrays.asList(line_2);
        List<String> line3 = Arrays.asList(line_3);

        StringBuilder directions = new StringBuilder();


        check_lines(line_1, line_2, line_3, start, end, line1, line2, line3, directions);

        return directions.toString();
    }

    private static void check_lines(String[] line_1, String[] line_2, String[] line_3, String start, String end, List<String> line1, List<String> line2, List<String> line3, StringBuilder directions) {
        // Check if start and end are on the same line
        theSameLine(line_1, line_2, line_3, start, end, line1, line2, line3, directions);

        // Check for interchange stations between different lines
        theDifferentLine(line_1, line_2, line_3, start, end, line1, line2, line3, directions);

    }

    private static void theDifferentLine(String[] line_1, String[] line_2, String[] line_3, String start, String end, List<String> line1, List<String> line2, List<String> line3, StringBuilder directions) {
        StringBuilder More_directions = new StringBuilder();
        String[] Station_transfer = {"Attaba,Sadat", "Nasser",};
        if (line1.contains(start) && line3.contains(end)) {
            directions.append("Line 1 (");
            directions.append(getStationName(line_1, start));
            directions.append(") to Line 3 (");
            directions.append(getStationName(line_3, end));
            directions.append(")");
//            if (line1.indexOf(start) > line3.indexOf(end)) {
//                System.out.println("The direction is El Monib");
//
//            } else {
//                System.out.println("The direction is Shubra");
//            }

        } else if (line3.contains(start) && line1.contains(end)) {
            directions.append("Line 3 (");
            directions.append(getStationName(line_3, start));
            directions.append(") to Line 1 (");
            directions.append(getStationName(line_1, end));
            directions.append(")");
        } else if (line2.contains(start) && line3.contains(end)) {
            directions.append("Line 2 (");
            directions.append(getStationName(line_2, start));
            directions.append(") to Line 3 (");
            directions.append(getStationName(line_3, end));
            directions.append(")");
        }
    }

    private static void theSameLine(String[] line_1, String[] line_2, String[] line_3, String start, String end, List<String> line1, List<String> line2, List<String> line3, StringBuilder directions) {
        if (line1.contains(start) && line1.contains(end)) {
            directions.append("Line 1 (");
            directions.append(getStationName(line_1, start));
            directions.append(") to Line 1 (");
            directions.append(getStationName(line_1, end));
            directions.append(")");
            if (line1.indexOf(start) > line1.indexOf(end)) {
                System.out.println("The direction is Helwan");
            } else {
                System.out.println("The direction is El marg");
            }


        } else if (line2.contains(start) && line2.contains(end)) {

            directions.append("Line 2 (");
            directions.append(getStationName(line_2, start));
            directions.append(") to Line 2 (");
            directions.append(getStationName(line_2, end));
            directions.append(")");

            if (line1.indexOf(start) > line1.indexOf(end)) {
                System.out.println("The direction is El Monib");

            } else {
                System.out.println("The direction is Shubra");
            }


        } else if (line3.contains(start) && line3.contains(end)) {

            directions.append("Line 3 (");
            directions.append(getStationName(line_3, start));
            directions.append(") to Line 3 (");
            directions.append(getStationName(line_3, end));
            directions.append(")");
        }
    }

    private List<String> allPath(Map<String, String> parent, String start, String end) {
        path = new ArrayList<>();

        for (String s = end; s != null; s = parent.get(s)) {
            path.add(s);
        }
        Collections.reverse(path);
        return path;
    }

    @Override
    public void addEdgesByLine(Graph g, @NotNull String[] line) {
        for (int i = 0; i < line.length - 1; i++) {
            g.addEdge(line[i], line[i + 1]);
        }

    }

    private List<List<String>> getAllPaths(String start, String end) {
        List<List<String>> paths = new ArrayList<>();
        List<String> path = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        path.add(start);
        dfs(start, end, visited, path, paths);
        return paths;
    }

    void printAllPaths(String start, String end) {
        List<List<String>> allPaths = getAllPaths(start, end);
        if (allPaths.isEmpty() || allPaths.contains("")) {
            System.out.println("No paths found from " + start + " to " + end + ".");
        } else {
            System.out.println("All paths from " + start + " to " + end + ":");
            int pathNumber = 1;
            Map<Integer, String> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            for (List<String> path : allPaths) {
                map.put(path.size(), "path " + pathNumber);
                if (path.size() < min)
                    min=path.size();
                System.out.println("Path " + pathNumber + ": " + String.join(" -> ", path));
                pathNumber++;
            }

            System.out.println("Recommended: ("+map.get(min)+") : because it just have "+map.keySet().stream().min(Comparator.naturalOrder()));

        }
    }

    private void dfs(String current, String end, Set<String> visited, List<String> path, List<List<String>> paths) {
        if (current.equals(end)) {
            paths.add(new ArrayList<>(path));
            return;
        }

        visited.add(current);

        for (String neighbor : adjacencyList.get(current)) {
            if (!visited.contains(neighbor)) {
                path.add(neighbor);
                dfs(neighbor, end, visited, path, paths);
                path.remove(path.size() - 1);
            }
        }

        visited.remove(current);
    }

    @Override
    public int numberOfAdjacent(String station) {
        if (!adjacencyList.containsKey(station)) {
            return -1; // or throw an exception if the vertex does not exist
        }
        return adjacencyList.get(station).size();
    }

    @NotNull
    @Contract(pure = true)
    private static String getStationName(String[] stations, String stationCode) {
        for (String station : stations) {
            if (station.equals(stationCode)) {
                return station;
            }
        }
        return "";
    }

    public void printPath(String start, String end, String[] line_1, String[] line_2, String[] line_3) {
        List<String> path = BFS(start, end);
        System.out.println(path);

        if (path.isEmpty() || path.contains("")) {
            System.out.println("No path found from [" + start + " to " + end + "]");
        } else {
            String direction = getDirection(line_1, line_2, line_3, start, end);
            System.out.println("Route : " + direction);
        }
    }

}
