
package com.mycompany.metroegypt.generic;

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
        List journey;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("please insert the start journey: ");
        String startJourney = input.nextLine();
        System.out.println("please insert the End station of the journey: ");
        String endJourney = input.nextLine();
        journey = lines.getJourneyFromTo(startJourney, endJourney);

        //the result
        if(lines.found(startJourney,endJourney))
        OpetationOfJourny.welcome_of_Journy(startJourney, endJourney);
        System.out.println("Total of stations is : " + journey.size() + " Stations");
        System.out.println("the Expected time of your Journy is : " + (OpetationOfJourny.lengh_by_time(journey.size()) + " Min"));
        System.out.println("the price of the Journy is  " + OpetationOfJourny.price(journey.size()) + " .LE");
        System.out.println("the Stations is :" + journey);
        System.out.println("------------------------------------------------------------------------");


    }


}












