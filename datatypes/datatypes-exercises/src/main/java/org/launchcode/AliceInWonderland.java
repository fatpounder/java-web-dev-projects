package org.launchcode;

import java.util.Scanner;
public class AliceInWonderland {
    public static void main(String[] args) {
        String aliceLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                "pictures or conversation?’";
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Enter term you would like to search:");
        String searchTerm = stringScanner.next();

        String firstSentence = searchTerm;

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
