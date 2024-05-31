package com.mycompany.metroegypt.generic;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String type="UNDIRCTED";
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Line 1 stations
//        String[] line1Stations = {
//                "Helwan", "Ain Helwan", "Helwan University", "Wadi Hof", "Hadayek Helwan", "El-Ma3adi",
//                "Sakanat El Maadi", "Maadi", "Thakanat El Maadi", "Dar El Salam", "El Zahraa", "Mar Girgis",
//                "El Malek El Saleh", "Al Sayeda Zeinab", "Saad Zaghloul", "Sadat", "Nasser", "Orabi",
//                "Al Shohadaa", "Ghamra", "El Demerdash", "Manshiet El Sadr", "Kobri El Qobba",
//                "Hammamat El Qobba", "Saray El Qobba", "Hadayeq El Zaitoun", "Helmeyet El Zaitoun",
//                "El Matareyya", "Ain Shams", "Ezbet El Nakhl", "El Marg", "New El Marg"
//        };
//
//        // Line 2 stations
//        String[] line2Stations = {
//                "Shobra El Kheima", "Kolleyyet El Zeraa", "Mezallat", "Khalafawy", "St. Teresa", "Rod El Farag",
//                "Massara", "Al Shohadaa", "Attaba", "Naguib", "Sadat", "Opera", "Dokki", "El Bohoth",
//                "Cairo University", "Faisal", "Giza", "Omm El Misryeen", "Sakiat Mekki", "El Monib"
//        };
//
//        // Line 3 stations
//        String[] line3Stations = {
//                "Kit Kat", "Sudan", "Imbaba", "El Bohoth", "Bab El Shaaria", "Attaba", "Nasser",
//                "Maspero", "Zamalek", "Nasser City", "Abbasia", "Cairo Stadium", "Kolleyyet El Banat",
//                "Al Ahram", "Haroun", "Hegaz", "Alf Maskan", "Heliopolis", "Al Shams Club",
//                "Alf Maskan", "El Nozha", "El Haykestep", "Adly Mansour"
//        };
//        List metroEgypt= new ArrayList<>();
//        //  Collections.addAll(metroEgypt,line2Stations,line1Stations,line3Stations);
//        metroEgypt.addAll(Arrays.asList(line1Stations));
//        metroEgypt.addAll(Arrays.asList(line2Stations));
//        metroEgypt.addAll(Arrays.asList(line3Stations));
//
//        System.out.println("_________________________________________________________________________________");
//        GraphImp<String> graphImp = new GraphImp();
//        graphImp.addEdges(metroEgypt.get(0).toString(), metroEgypt.get(1).toString(), 5.3);
//
//        for (int i = 0; i <= metroEgypt.size() ; i++) {
//
//            if (i < metroEgypt.size() -1 && i > 0) {
//                graphImp.addEdges(metroEgypt.get(i).toString(), metroEgypt.get(i - 1).toString(), 5.3);
//                graphImp.addEdges(metroEgypt.get(i).toString(), metroEgypt.get(i + 1).toString(), 5.3);
//            }
//
//        }
//
//        System.out.println(graphImp);
//        graphImp.getEdgeCount();
//        graphImp.getVertexCount();
//
//
//
//
////        List<ArrayList<String>> paths = new ArrayList<ArrayList<String>>();
////        System.out.println(" please insert the start station ");
////        String startStation = input.next();
//
////        List<String> visited = new ArrayList<String>();
////        visited.add(startStation);
//
//
////output
//
//        System.out.print("Enter current station: ");
//        String startStation = input.nextLine();
//        System.out.print("Enter destination station: ");
//        String endStation = input.nextLine();
//        OperationsOFJourny.welcome_of_Journy(startStation,endStation);
//        if(!metroEgypt.contains(startStation)&&!metroEgypt.contains(endStation))
//        {
//            System.out.println("Your Input is Invalid : ");
//            return;
//        }else {
//            List list = graphImp.getPath(startStation, endStation);
//            System.out.println("The Number of stations is : " + list.size() + " Stations");
//            System.out.println("The total time of Journey : " + OperationsOFJourny.lengh_by_time(list.size()) + " Min");
//            // Print the path
//            graphImp.printPath(startStation, endStation);
//            System.out.println("the price of Ticket: " + OperationsOFJourny.price(list.size()) + " LE");
//
//        }
//
//        input.close();
    }
}
