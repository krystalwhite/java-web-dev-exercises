package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private LocalDate lastUpdated;


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

    public LocalDate getLastUpdated() { return lastUpdated; }

    public void setLastUpdated(LocalDate lastUpdated) { this.lastUpdated = lastUpdated; }

    public void updateMenu() {
        this.lastUpdated = LocalDate.now();
    }

    public void addItem (MenuItem itemToAdd) {
        this.menu.add(itemToAdd);
        updateMenu();
        //
//        for (MenuItem item : this.menu) {
//            if (itemToAdd.equals(item) == false) {
//                this.menu.add(itemToAdd);
//                updateMenu();
//                return;
//            } else if (itemToAdd.equals(item) == true){
//                System.out.println("This item is already on the menu.");
//            }
//        }
    }

    public void remove (MenuItem itemToRemove) {
        int index = this.menu.indexOf(itemToRemove);
        this.menu.remove(index);
        updateMenu();
    }

    public void printAllMenuItems() {

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


