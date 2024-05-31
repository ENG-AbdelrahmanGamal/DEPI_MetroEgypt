package com.mycompany.metroegypt.generic;

import java.util.*;

public class Lines {
    List line_1= Arrays.asList("Rod Al-Farag Corridor",
            "Ring Road","Al-Kawmeiah" ,"Al-Bohy" ,"Imbaba","Sudan","Kit Kat" ,"Zamalek","Maspero",
            "Naser","Bab El Shaaria" ,"El Geish" ,"Abdou Pasha" ,"Abbassia","Fair Zone","Cairo Stadium","Koleyet El Banat" ,"Al Ahram","Haroun","Heliopolis Square" ,
            "Alf Masken" ,"El-Shams Club" ,"El-Nozha" ,"Hisham Barakat" ,"Kebaa","Omar ibn Al-khattab", "Hikestep","Adly Mansour"
);

    List line_2= Arrays.asList("R","g","gg","R","g","gg","R","g","gg" );

    List line_3= Arrays.asList("Re","ewe","sf","df","er");

    public List getLine_1_from(String from) {

        return line_1;
    }
//    Graph<List> g = new Graph<List>();

    public String fountStart(String startJourney){
        String result=null;
        if(line_1.contains(startJourney)) {
            result = "line_1";
        }else if (line_2.contains(startJourney)) {
            result = "line_2";
        } else if (line_3.contains(startJourney)) {
            result = "line_3";
        }
        return result;
    }


    public String fountEnd(String endJourney){
        String result=null;
        if(line_1.contains(endJourney)) {
            result = "line_1";
        }else if (line_2.contains(endJourney)) {
            result = "line_2";
        } else if (line_3.contains(endJourney)) {
            result = "line_3";
        }
        return result;
    }

    public boolean found(String startJourney,String endJourney ){return (line_1.contains(startJourney)&&line_1.contains(endJourney));}
    public List getJourneyFromTo(String startJourney,String endJourney) {
        List  journey=null;
        Queue<List> queue = new LinkedList<>();

      try{
        if (line_1.contains(startJourney) && line_1.contains(endJourney)) {
            if (line_1.indexOf(startJourney) > line_1.indexOf(endJourney))
                Collections.reverse(line_1);

          journey = new ArrayList<>(line_1.subList(line_1.indexOf(startJourney), line_1.indexOf(endJourney) + 1));
           queue.add(journey);
            System.out.println(queue);
            }    //
                // the result if the input

            }catch (Exception e){
                System.out.println(" >>>>Invalid Input please insert correct Station >>> \n"+e.getLocalizedMessage());
            }



        return journey;
    }

    public void setLine_1(List line_1) {
        this.line_1 = line_1;
    }

    public List getLine_2() {
        return line_2;
    }

    public void setLine_2(List line_2) {
        this.line_2 = line_2;
    }

    public List getLine_3() {
        return line_3;
    }

    public void setLine_3(List line_3) {
        this.line_3 = line_3;
    }

}
