package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a radius");
//        double PI = 3.14;
//        if (input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//            if (radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle of radius " + radius + " is: " + area);
//            } else {
//                System.out.println("Radius must be a positive number.");
//            }
//        } else {
//            System.out.println("Please enter a valid number.");
//        }

        double radius;
        do {
            System.out.println("Enter a number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid, positive number. ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);


        input.close();
    }

}
