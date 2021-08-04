package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();
        MenuItem salad = new MenuItem("appetizer", "House salad", 1.99, false);
        MenuItem beanSoup = new MenuItem("appetizer", "Vegan black bean soup with chipotle chilis", 3.99, false);
        MenuItem hummus = new MenuItem("appetizer", "Hummus with pita triangles", 4.99, true);
        MenuItem beanBurger = new MenuItem("main", "Black bean burger with sweet potato fries", 8.99, false);
        MenuItem veggieFajitas = new MenuItem("main", "Veggie fajitas with squash, broccoli, peppers, onions", 11.99, true);
        MenuItem tiramisu = new MenuItem("dessert", "Tiramisu", 6.99, false);
        MenuItem fruitParfait = new MenuItem("dessert", "Fruit parfait with local berries and peaches", 2.99, true);

        menu.add(salad);
        menu.add(beanBurger);
        menu.add(hummus);
        menu.add(beanSoup);
        menu.add(veggieFajitas);
        menu.add(fruitParfait);
        menu.add(tiramisu);


        //    converting publish date from string to Date form
//        LocalDate publishDate = LocalDate.parse(publishDateString);
////    LocalDate currentDate = LocalDate.parse(currentDateString);
//        LocalDate currentDate = LocalDate.now();
//        long noOfDaysBetween = ChronoUnit.DAYS.between(publishDate, currentDate);

//updating menu item age based on menu publication date
//    public void updateItemAge(MenuItem item) {
//        if (noOfDaysBetween > 60) {
//            MenuItem.setNewItem(item) = false;
//        } else {
//            MenuItem.setNewItem(item) = true;
//        }
//    }





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

//    Menu consists of several MenuItems and when last updated
//    MenuItem includes price description, category (appetizer, main course, dessert), whether it's new or not

