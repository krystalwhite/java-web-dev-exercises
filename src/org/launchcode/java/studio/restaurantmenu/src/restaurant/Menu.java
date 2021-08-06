package restaurant;
import java.util.Date;


//public addMenuItem()  -- call another method to determine when the menu was previously updated
//removeMenuItem();


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private String publishDateString;
    private String currentDateString;
    private LocalDate lastUpdated;

//    private int lastDateMenuUpdated = new Date().getDay();
//    public Menu(ArrayList<MenuItem> menu, String publishDateString) {
//        this.menu = menu;
//        this.publishDateString = publishDateString;
//    }

    public Menu(ArrayList<MenuItem> menu, LocalDate lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public String getPublishDateString() { return publishDateString; }

    public void setPublishDateString(String publishDateString) { this.publishDateString = publishDateString; }

    public String getCurrentDateString() { return currentDateString; }

    public void setCurrentDateString(String currentDateString) { this.currentDateString = currentDateString; }

    public LocalDate getLastUpdated() { return lastUpdated; }

    public void setLastUpdated(LocalDate lastUpdated) { this.lastUpdated = lastUpdated; }

    //    converting publish date from string to LocalDate form and updating menu item age based on menu publication date
//    I don't really understand how LocalDate works or how to embed the various methods classes and call them to cascade this overall
/*
    public void updateItemAge() {
        LocalDate publishDate = LocalDate.parse(publishDateString);
        LocalDate currentDate = LocalDate.now();
        long noOfDaysBetween = ChronoUnit.DAYS.between(publishDate, currentDate);

        System.out.println(noOfDaysBetween);
//        for (MenuItem item : menu) {
//            if (noOfDaysBetween < 60) {
//                item.setIsNewItem(true);
//            } else {
//                item.setIsNewItem(false);
//            }
//        }

    }
*/
    public void addItem (MenuItem itemToAdd) {
        this.menu.add(itemToAdd);
    }

    public void remove (MenuItem itemToRemove) {
        int index = this.menu.indexOf(itemToRemove);
        this.menu.remove(index);
    }

    public void printAllMenuItems() {
//        updateItemAge();

        System.out.println("\nAppetizers");
        for (MenuItem item : menu) {
            if (item.getCategory() == "appetizer") {
                item.printMenuItem();
            }
        }

        System.out.println("\nMain Entrees");
        for (MenuItem item : menu) {
            if (item.getCategory() == "main") {
                item.printMenuItem();
            }
        }

        System.out.println("\nDesserts");
        for (MenuItem item : menu) {
            if (item.getCategory() == "dessert") {
                item.printMenuItem();
            }
        }
        System.out.println("\n\tMenu updated on " + this.lastUpdated + ".");

    }
    }


