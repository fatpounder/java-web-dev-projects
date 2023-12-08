package org.launchcode;


public class MenuItem {
    private String name;

    private String description;
    private double price;

    private String category;

    private Boolean newItem;

    public MenuItem (String name, String description, double price, String category, Boolean newItem) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.newItem = newItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNewItem() {
        return newItem;
    }
}
