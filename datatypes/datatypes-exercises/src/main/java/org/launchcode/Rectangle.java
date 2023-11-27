package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        int rectLength = input.nextInt();

        System.out.println("What is the width of the rectangle?");
        int rectWidth = input.nextInt();

        int area = rectWidth*rectLength;
        System.out.println("The area of the rectangle is " + area);

        input.close();
    }
}
