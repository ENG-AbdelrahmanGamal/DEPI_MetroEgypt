package com.mycompany.metroegypt;

public interface OpetationOfJourny {

     static int price(int number_Of_Stations){
        int price_of_teckit = 0;
        if (number_Of_Stations <= 9) {
            price_of_teckit = 6;
        } else if (number_Of_Stations <= 16) {
            price_of_teckit = 8;
        } else if (number_Of_Stations <= 23) {
            price_of_teckit = 12;
        } else {
            price_of_teckit = 15;     }
        return price_of_teckit;
    }
    static int lengh_by_time(int length){
         return length*2;
    }

    static void welcome_of_Journy(String start,String end){
        System.out.println("welcome traveling by metro from" + start + " Station to " + end + " Station");
    }
}
