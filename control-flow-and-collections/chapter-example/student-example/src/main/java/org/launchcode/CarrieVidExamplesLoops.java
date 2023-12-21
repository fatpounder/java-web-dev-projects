package org.launchcode;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CarrieVidExamplesLoops {
    public static void main(String[] args) {

        //TODO: For Loop, Construct a basic for loop to print each battle

        String[] battles = {
                "The Battle of Moria",
                "The Battle for Isengard",
                "The Battle of Helm's Deep",
                "The Battle of the Pelennor Fields",
                "The Battle of the Black Gate"
        };

        for (int i = 0; i < battles.length; i++) {
            System.out.println(battles[i]);
        }

        //TODO: For-Each Loop, Construct a for-each loop to print each element of the Array

        String[] words = {"YOU", "SHALL", "NOT", "PASS"};
        for (String word: words) {
            System.out.println(word);
        }

        //TODO: For-Each Loops with Map

        HashMap<String, String> moria = new HashMap<>();

        moria.put("name", "the Mines of Moria");
        moria.put("ancientName", "Khazad-dum");
        moria.put("location", "the Misty Mountains");
        moria.put("founder", "Durin");
        moria.put("king", "Balin");
        moria.put("monster", "balrog");

        //loops through the keys and print each
        for (String key : moria.keySet()) {
            System.out.println(key);
        }

        //loop through the values and print each
        for (String value : moria.values()) {
            System.out.println(value);
        }

        //loop through the entries (key/value pairs) and print them
        //need to import java.util.Map; to use Map
        for (Map.Entry<String, String> entry : moria.entrySet()) {
            System.out.println("The " + entry.getKey() + " of Moria is " + entry.getValue());
        }

        //TODO: Use a While Loop to print each number in the Array as long as the value is below 100
        int[] orcs = {2, 14, 33, 57, 61, 89, 94, 106, 123, 176};

        int index = 0;
        while (orcs[index] < 100) {
            System.out.println(orcs[index]);
            index++;
        }

        //TODO: Use a Do-While Loop to ask the user for book titles until they enter "QUIT"
        //Note: Use .nextLine() instead of .next() to handle multi-word strings
        //Unless quitting, add each title to the collection above
        //Print the collection after the loop closes
        ArrayList<String> bookTitles = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String title;
        boolean isQuitting = false;

        do {
            System.out.println("Please enter a book title or QUIT: ");
            title = input.nextLine();
            isQuitting = title.toLowerCase().equals("quit");
            if (!isQuitting) {
                bookTitles.add(title);
            }
        } while (!isQuitting);

        System.out.println(bookTitles);

        input.close();

    }

}
