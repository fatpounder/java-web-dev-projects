package org.launchcode;

import java.time.LocalDate;
import java.util.HashMap;


public class Menu {

    private String title;

    private MenuItem menuItem;

    private Boolean newItem;

    private String date;
    //TODO: Change to import date

    private String specials;

    public Menu(String title, MenuItem menuItem, Boolean newItem, String date, String specials) {
        this.title = title;
        this.menuItem = menuItem;
        this.newItem = newItem;
        this.date = date;
        this.specials = specials;

    }




}
