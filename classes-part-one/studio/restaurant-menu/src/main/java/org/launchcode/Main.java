package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    MenuItem item1 = new MenuItem("Pizza", "Super Cheese!", 10.00, "Main Dish");
    MenuItem item2 = new MenuItem("Egg Rolls", "Spicy", 10.00, "Appetizer");
    MenuItem item3 = new MenuItem("Flan", "Yummy", 10.00, "Dessert");
    MenuItem item4 = new MenuItem("Pasta", "Giant", 10.00, "Main Dish");
    MenuItem item5 = new MenuItem("Pasta", "Giant", 10.00, "Main Dish");

    ArrayList<MenuItem> fullMenu = new ArrayList();
    fullMenu.add(item1);
    fullMenu.add(item2);
    fullMenu.add(item3);
    fullMenu.add(item4);
    fullMenu.add(item5);

    System.out.println(fullMenu);

    if (item4.equals(item5)) {
        System.out.println("This is the same pasta! Get me your manager!");
        } else {
        System.out.println("Wow, such a wide variety of pasta!");
    }

    if (item1.equals(item2)) {
        System.out.println("Why did you give us the same dish? I'm giving you a bad Yelp review!");
    } else {
        System.out.println("Hey, good job! I'll tip you a whole dollar!");
    }

    //checking to see if the item is new or not
    //Will be true unless we are working with something like a database
    System.out.println(item1.isNew());
    System.out.println(item2.isNew());
    System.out.println(item3.isNew());
    System.out.println(item4.isNew());
    System.out.println(item5.isNew());

    //Use override in menuItem to make this print happy
    System.out.println(item1);
    System.out.println(item2);
    System.out.println(item3);
    System.out.println(item4);
    System.out.println(item5);

    }
}
