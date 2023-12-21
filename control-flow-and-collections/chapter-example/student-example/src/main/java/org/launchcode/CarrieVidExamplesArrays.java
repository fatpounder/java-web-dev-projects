package org.launchcode;

import java.util.Arrays;

public class CarrieVidExamplesArrays {
    public static void main(String[] args) {
        //TODO: Declare an empty array named hobbits that can hold 8 elements of type String
        String[] hobbits = new String[8];

        //TODO: Add 4 hobbits at different indices
        hobbits[0] = "Frodo";
        hobbits[2] = "Sam";
        hobbits[5] = "Pippin";
        hobbits[7] = "Merry";

        //TODO: Print an element at an index with an unassigned value
        System.out.println(hobbits[1]);

        //TODO: Print the array by name
        System.out.println(hobbits);
        //prints weird, need to use Arrays.toString() to see the elements

        //TODO: Use Arrays.toString() to print the array's contents
        System.out.println(Arrays.toString(hobbits));

        //TODO: Declare an array of integers representing how many of each race there were in the fellowship
        //wizard, hobbit, elf, dwarf, man
        int[] fellowship = {1, 4, 1, 1, 2};

        //TODO: Print a sentence with the number of men
        System.out.println("There were " + fellowship[4] + " men in the fellowship of the ring.");

        //TODO: Print the array elements using Arrays.toString()
        System.out.println(Arrays.toString(fellowship));

    }
}
