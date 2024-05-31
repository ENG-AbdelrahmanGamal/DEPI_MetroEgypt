package com.mycompany.metroegypt.generic;

public interface OperationsOFJourny {

    static int price(int number_Of_Stations){
        int price_of_teckit = 0;
        if (number_Of_Stations >= 23) {
            price_of_teckit = 12;
        } else if (number_Of_Stations >= 16) {
            price_of_teckit = 8;
        } else if (number_Of_Stations >= 9) {
            price_of_teckit = 9;
        } else if(number_Of_Stations>=0){
            price_of_teckit = 6;
        }
        else {
            price_of_teckit=0;
        }

        return price_of_teckit;
    }
    static String lengh_by_time(int length){
        int minutes=(length*2);
        int hours=minutes/60;
        int remainingMinutes = minutes % 60;
        return String.format("%02d:%02d", hours, remainingMinutes);
    }

    static void welcome_of_Journy(String start,String end){
        System.out.println("welcome traveling by metro from" + start + " Station to " + end + " Station");
    }
}
