package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LocalDate menuUpdated = LocalDate.parse("2021-05-15");
        LocalDate currentDate = LocalDate.now();
        ArrayList<MenuItem> summerMenuList = new ArrayList<>();
        MenuItem salad = new MenuItem("House Salad", "appetizer", "House salad", 1.99, false);
        MenuItem beanSoup = new MenuItem("Black Bean Soup", "appetizer", "Vegan black bean soup with chipotle chilis", 3.99, false);
        MenuItem hummus = new MenuItem("Hummus", "appetizer", "Hummus with pita triangles", 4.99, true);
        MenuItem beanBurger = new MenuItem("Veggie Burger", "main", "Black bean burger with sweet potato fries", 8.99, false);
        MenuItem veggieFajitas = new MenuItem("Veggie Fajitas", "main", "Veggie fajitas with squash, broccoli, peppers, onions", 11.99, true);
        MenuItem tiramisu = new MenuItem("Tiramisu", "dessert", "Tiramisu", 6.99, false);
        MenuItem fruitParfait = new MenuItem("Seasonal Fruit Parfait", "dessert", "Fruit parfait with local berries and peaches", 2.99, true);

        Menu summerMenu = new Menu(summerMenuList, menuUpdated);

        summerMenu.addItem(salad);
        summerMenu.addItem(beanBurger);
        summerMenu.addItem(hummus);
        summerMenu.addItem(beanSoup);
        summerMenu.addItem(veggieFajitas);
        summerMenu.addItem(fruitParfait);
        summerMenu.addItem(tiramisu);

//        summerMenu.updateItemAge();

        summerMenu.printAllMenuItems();
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





