package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
public class countingcharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = (input.nextLine().toLowerCase());

//        String myString = "If the product of two terms is zero then common sense says at least one of the two " +
//                "terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
//                "the quadratics into a form that can be factored allowing that side of the equation to equal " +
//                "zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = userString.toCharArray();



        HashMap<Character, Integer> alphaNums = new HashMap<>();

        for (char letter : charactersInString) {
            if (alphaNums.containsKey(letter)) {
                alphaNums.put(letter, alphaNums.get(letter) +1);
            } else {
                alphaNums.put(letter, 1);
            }
        }
        System.out.println(alphaNums);

        input.close();
    }
}
