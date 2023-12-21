package org.launchcode;

import java.util.Scanner;
public class LoopExamples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = in.nextInt();
        if (grade < 60) {
            System.out.println('F');
        } else if (grade < 70) {
            System.out.println('D');
        } else if (grade < 80) {
            System.out.println('C');
        } else if (grade < 90) {
            System.out.println('B');
        } else {
            System.out.println('A');
        }
        //for loops
        for (int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }
        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
        //for-each loops
        int numb[] = {1, 1, 2, 3, 5, 8, 13, 21};
        for (int i : numb) {
            System.out.println(i);
        }
        String msg = "Hello World";
        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
        //while loop
        int i = 0;
        while (i < 3) {
            i++;
        }
        //do-while loop
        do {
            System.out.println("Hello, World");
        } while (false);
        //break statement
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }
        //continue statement
        int[] randInts = {1, 10, 2, 3, 5, 8, 10};
        int searchNum = 10;
        for (int oneInt : randInts) {
            if (oneInt == searchNum) {
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not here");
        }
    }
}
