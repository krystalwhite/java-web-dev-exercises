package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
//calls and instantiates the Menu and MenuItems


    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();
        MenuItem salad = new MenuItem("House Salad", "appetizer", "House salad", 1.99, false);
        MenuItem beanSoup = new MenuItem("Black Bean Soup", "appetizer", "Vegan black bean soup with chipotle chilis", 3.99, false);
        MenuItem hummus = new MenuItem("Hummus", "appetizer", "Hummus with pita triangles", 4.99, true);
        MenuItem beanBurger = new MenuItem("Veggie Burger", "main", "Black bean burger with sweet potato fries", 8.99, false);
        MenuItem veggieFajitas = new MenuItem("Veggie Fajitas", "main", "Veggie fajitas with squash, broccoli, peppers, onions", 11.99, true);
        MenuItem tiramisu = new MenuItem("Tiramisu", "dessert", "Tiramisu", 6.99, false);
        MenuItem fruitParfait = new MenuItem("Seasonal Fruit Parfait", "dessert", "Fruit parfait with local berries and peaches", 2.99, true);

        menu.add(salad);
        menu.add(beanBurger);
        menu.add(hummus);
        menu.add(beanSoup);
        menu.add(veggieFajitas);
        menu.add(fruitParfait);
        menu.add(tiramisu);


//        print Menu by Categories
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





