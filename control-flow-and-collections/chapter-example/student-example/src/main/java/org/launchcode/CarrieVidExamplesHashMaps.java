package org.launchcode;

import java.util.HashMap;

public class CarrieVidExamplesHashMaps {
    public static void main(String[] args) {

        //TODO: Declare an empty HashMap, add key/value pairs, print the map

        //create a map, itemsToPack, that can hold String keys and Integer values
        HashMap<String, Integer> elfAges = new HashMap<>();
        //Add 4 key/value pairs to it representing the elves and their ages
        elfAges.put("Legolas", 2931);
        elfAges.put("Arwen", 2901);
        elfAges.put("Elrond", 6497);
        elfAges.put("Galadriel", 8382);

        //Print the map
        System.out.println(elfAges);

        //TODO: Practice using different methods of the Hashmap class

        //Print the size
        System.out.println(elfAges.size());

        //Print the entry set
        System.out.println(elfAges.entrySet());  //Looks like the map printout, but is in an arraylist form

        //Print just the key set
        System.out.println(elfAges.keySet());

        //Print just the values
        System.out.println(elfAges.values());

        //Check if it contains a certain key and print result
        System.out.println(elfAges.containsKey("Arwen"));

        //Check if it contains a certain value and print result
        System.out.println(elfAges.containsValue(5000));

    }
}
