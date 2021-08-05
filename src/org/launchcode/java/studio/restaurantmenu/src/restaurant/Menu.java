package restaurant;
import java.util.Date;

//public void printAllMenuItems();
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
    private int lastDateMenuUpdated = new Date().getDay();

//    public Menu(ArrayList<MenuItem> menu, String publishDateString) {
//        this.menu = menu;
//        this.publishDateString = publishDateString;
//    }

    public Menu(ArrayList<MenuItem> menu, LocalDate lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

//    getters and setters
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

    //    converting publish date from string to Date form
    LocalDate publishDate = LocalDate.parse(publishDateString);
//    LocalDate currentDate = LocalDate.parse(currentDateString);
    LocalDate currentDate = LocalDate.now();
    long noOfDaysBetween = ChronoUnit.DAYS.between(publishDate, currentDate);

//updating menu item age based on menu publication date
//    public void updateItemAge(MenuItem item) {
//        if (noOfDaysBetween > 60) {
//            MenuItem.setNewItem(item) = false;
//        } else {
//            MenuItem.setNewItem(item) = true;
//        }
//    }

    public void remove (MenuItem itemToRemove) {
        int index = this.menu.indexOf(itemToRemove);
        this.menu.remove(index);
    }

    public void printAllMenuItems (Menu completeMenu) {
        System.out.println("Appetizers");
        for (MenuItem item : menu) {
            if (item.getCategory() == "appetizer") {
                if (item.getIsNewItem() == true) {
                    System.out.printf("New Item: ");
                }
                System.out.println(item.getDescription() + " ..... $" + item.getPrice());
            }
        }

        System.out.println("\nMain Entrees");
        for (MenuItem item : menu) {
            if (item.getCategory() == "main") {
                if (item.getIsNewItem() == true) {
                    System.out.printf("New Item: ");
                }
                System.out.println(item.getDescription() + " ..... $" + item.getPrice());
            }
        }

        System.out.println("\nDesserts");
        for (MenuItem item : menu) {
            if (item.getCategory() == "dessert") {
                if (item.getIsNewItem() == true) {
                    System.out.printf("New Item: ");
                }
                System.out.println(item.getDescription() + " ..... $" + item.getPrice());
            }
        }

    }
    }


