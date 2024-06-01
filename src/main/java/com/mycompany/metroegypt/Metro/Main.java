package com.mycompany.metroegypt.Metro;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();
        Scanner input = new Scanner(System.in);

        String[] line_1 = {
                "Helwan", "Ain Helwan", "Helwan University", "Wadi Hof", "Hadayek Helwan", "El-Maasara", "Tora El-Asmant",
                "Kotsika", "Tora El-Balad", "Sakanat El-Maadi", "Maadi", "Hadayek El-Maadi", "Dar El-Salam", "El-Zahraa",
                "Mar Girgis", "El-Malek El-Saleh", "Sayeda Zeinab", "Saad Zaghloul", "Sadat", "Nasser", "Orabi", "Al-Shohadaa",
                "Ghamra", "El-Demerdash", "Manshiet El-Sadr", "Kobri El-Qobba", "Hammamat El-Qobba", "Saray El-Qobba",
                "Hadayek El-Zaitoun", "El-Matareyya", "Ain Shams", "Ezbet El-Nakhl", "El-Marg", "New El-Marg"
        };

        String[] line_2 = {
                "Shobra El-Kheima", "Koliet El-Zeraa", "Mezallat", "Khalafawy", "St. Teresa", "Rod El-Farag", "Massara",
                "Al-Shohadaa", "Attaba", "Naguib", "Sadat", "Opera", "Dokki", "El Bohoth", "Cairo University", "Faisal",
                "Giza", "Omm El Misryeen", "Sakiat Mekki", "El-Mounib"
        };

        String[] line_3 = {
                "Adly Mansour", "El Haykestep", "Omar Ibn El-Khattab", "Qobaa", "Hesham Barakat", "El-Nozha",
                "Nadi El-Shams", "Alf Maskan", "Helioplis", "Haroun", "Al Ahram", "Koliet El Banat", "Stadium",
                "Fair Zone", "Abbassiya", "Abdou Pasha", "El-Geish", "Bab El-Shaaria", "Attaba", "Nasser", "Maspero",
                "Safaa-Hijazy", "Kit-Kat", "Sudan", "imbaba", "El-Bohy", "El-Qawmia", "Ring-Road", "Rod El Farag Corridor"
        };
        String[] line_4 = {"Kit-Kat","Tawfikia","Wadi El Nile","Gamet El Dowal","Boulak El Dakrour","Cairo University"};
        graph.addEdgesByLine(graph, line_1);
        graph.addEdgesByLine(graph, line_2);
        graph.addEdgesByLine(graph, line_3);
        graph.addEdgesByLine(graph, line_4);

        System.out.print("Please enter the beginning \t");
        String start = input.nextLine();
        System.out.println();
        System.out.print("Please enter arrived station ");
        String end = input.nextLine();
        System.out.println();

      //  checkInvalidInput(graph, start, end);
          //  graph.shortPath();
         printing(graph,"Tawfikia","Cairo University");
        System.out.println(graph.numberOfAdjacent("Rod El-Farag"));
        System.out.println(graph.numberOfAdjacent("Massara"));
    }

    private static void checkInvalidInput(Graph graph, String start, String end) {
        if (!graph.path.contains(start) || !graph.path.contains(end)) {
            System.out.println("Invalid input");
            return;
        }
    }

    public static void  printing(Graph graph,String start,String end){
    graph.printAllPaths(start, end);
    System.out.println();
   // graph.printPath(start, end, line_1, line_2, line_3);

    graph.getTimeOfJourney();
    graph.getPriceOfJourney();
}
}


//Rod El-Farag   was duplicated
//Massara
