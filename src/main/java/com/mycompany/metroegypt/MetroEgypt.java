
package com.mycompany.metroegypt;

import java.util.*;

public class MetroEgypt implements OpetationOfJourny {
// number of station
// time expected 10*2 min
// price of teket more than 10 = 8
// list to journey  sub list
// direction of the journey
// collections.reverse()


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lines lines = new Lines();

        List metro_line_3 = lines.line_3;
        List metro_line_2 = lines.line_2;
        List metro_line_1 = lines.line_1;
        ArrayList journey;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Welcome in the subway  please insert the start journey: ");
        String startJourney = input.nextLine();

        System.out.println("Welcome in the subway  please insert the End station of the journey: ");
        String endJourney = input.nextLine();

        if (metro_line_3.contains(startJourney) && metro_line_3.contains(endJourney)) {
            if (metro_line_3.indexOf(startJourney) > metro_line_3.indexOf(endJourney))
                Collections.reverse(metro_line_3);
            journey = new ArrayList<>(metro_line_3.subList(metro_line_3.indexOf(startJourney), metro_line_3.indexOf(endJourney) + 1));

            //the result
            OpetationOfJourny.welcome_of_Journy(startJourney,endJourney);
            System.out.println("Total of stations is : " + journey.size() + " Stations");
            System.out.println("the Expected time of your Journy is : " + (OpetationOfJourny.lengh_by_time(journey.size()) + " Min"));
            System.out.println("the price of the Journy is  " +  OpetationOfJourny.price(journey.size())+ " .LE");
            System.out.println("the Stations is :" + journey);

        } else {
            // the result if the input invalid
            System.out.println("this not the station try again >>> ");
            return;
        }
        System.out.println("------------------------------------------------------------------------");

    }


}












