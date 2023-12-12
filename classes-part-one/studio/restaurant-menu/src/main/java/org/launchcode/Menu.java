package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }

    public void removeItem(MenuItem item3) {
        this.menuItems.remove(item3);
    }

    //default constructor is being used
    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }
    //need to use override to make listing menu items look happy for each category using StringBuilder
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainDish = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Main Dish")) {
                mainDish.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nRestaurant Menu\n" + "Appetizers" + appetizers.toString() + "\n" + "Main Dishes" + mainDish.toString() + "\n" + "Desserts" + desserts.toString() + "\n";
    }
}
