package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;

public class CarrieVidExamplesArrayList {
    public static void main(String[] args) {

        //TODO: Declare two empty arraylists
        //elves, String and ages, Integer
        ArrayList<String> elves = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        //TODO: Add elements to each of arraylists above
        //add four elves
        elves.add("Legolas");
        elves.add("Arwen");
        elves.add("Elrond");
        elves.add("Galadriel");

        //add the ages of the four elves above
        ages.add(2931);
        ages.add(2901);
        ages.add(6497);
        ages.add(8382);

        //TODO: Print each arraylist
        System.out.println(elves);
        System.out.println(ages);

        //TODO: Print the size of elves
        System.out.println(elves.size());

        //TODO: Check to see if ages contains 2901 and print the result
        System.out.println(ages.contains(2901));

        //TODO: Sort elves and then print it
        Collections.sort(elves);
        System.out.println(elves);
        //NOTE: Now the names and ages don't correlate. This is why we will use hashmaps

    }
}
