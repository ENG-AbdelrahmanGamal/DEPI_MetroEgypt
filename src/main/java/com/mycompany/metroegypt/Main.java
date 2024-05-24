package com.mycompany.metroegypt;


import com.mycompany.metroegypt.GraphImp.AdjacentList;
import com.mycompany.metroegypt.GraphImp.GRAPH;
import com.mycompany.metroegypt.GraphImp.Vertex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String type="UNDIRCTED";
    public static void main(String args[]) {
        GRAPH graph=new AdjacentList<String>();

        ArrayList<Vertex> arrayLists = new ArrayList<>();
        List vertices=  Arrays.asList("Helwan", "Ain Helwan","Helwan University","Wadi Hof","Hadayek Helwan", "El Maadi","Thakanat El Maadi",
                "Dar El Salam", "Hadayek El Maadi", "Torrah El Balad", "El Ma’asara", "El Zahraa",
                "Mar Girgis", "El Malek El Saleh", "Al Sayeda Zeinab", "Saad Zaghloul", "Sadat", "Gamal Abdel Nasser", "Orabi", "Al Shohadaa", "Ghamra",
                "El Demerdash", "Manshiet El Sadr", "Kobri El Qobba", "Hammamat El Qobba", "Saray El Qobba", "Hadayeq El-Zaytoun", "Helmeyet El-Zaytoun",
                "El Matariya", "Ain Shams", "Ezbet El Nakhl", "El Marg", "New El Marg", "Rod Al-Farag Corridor", "Ring Road","Al-Kawmeiah" ,"Al-Bohy" ,"Imbaba","Sudan","Kit Kat" ,"Zamalek","Maspero",
                "Naser","Bab El Shaaria" ,"El Geish" ,"Abdou Pasha" ,"Abbassia","Fair Zone","Cairo Stadium","Koleyet El Banat" ,"Al Ahram","Haroun","Heliopolis Square" ,
                "Alf Masken" ,"El-Shams Club" ,"El-Nozha" ,"Hisham Barakat" ,"Kebaa","Omar ibn Al-khattab", "Hikestep","Adly Mansour",
                "Shubra El Kheima", "Koliet El Zeraa", "Mezallat", "Khalafawy", "St. Teresa", "Rod El Farag", "Masarra", "Al Shohadaa", "Attaba", "Mohamed Naguib", "Sadat", "Opera", "Dokki",
                "Bohooth", "Cairo University", "Fayoum University", "Giza", "Omm El Misryeen", "Sakiat Mekki","El Monib"
        );


        //initialization to verticies
        for (int i = 0; i <vertices.size() ; i++) {
          Vertex  vertice= graph.createVertix(vertices.get(i));
          arrayLists.add(vertice);
        }
        //initialization to edges
        for (int i = 0; i <vertices.size() ; i++) {

            graph.add(type, arrayLists.get(i),arrayLists.get(i),2.2);
        }
//       System.out.println(graph);
//        System.out.println(graph.getVertex(7));
//        System.out.println(graph.getSize());
//        System.out.println(graph.getVertices());
//        System.out.println(graph.timeMove(arrayLists.get(3)));
        graph.depthFirstSearch(arrayLists.get(6));
        arrayLists.forEach(it-> System.out.println(it.getData()));


    }
}
