package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MenuItem> summerMenuList = new ArrayList<>();
        MenuItem salad = new MenuItem("House Salad", "appetizer", "House salad", 1.99, LocalDate.parse("2019-05-15"));
        MenuItem beanSoup = new MenuItem("Black Bean Soup", "appetizer", "Vegan black bean soup with chipotle chilis", 3.99, LocalDate.now());
        MenuItem hummus = new MenuItem("Hummus", "appetizer", "Hummus with pita triangles", 4.99, LocalDate.now());
        MenuItem beanBurger = new MenuItem("Veggie Burger", "main", "Black bean burger with sweet potato fries", 8.99, LocalDate.parse("2019-05-15"));
        MenuItem veggieFajitas = new MenuItem("Veggie Fajitas", "main", "Veggie fajitas with squash, broccoli, peppers, onions", 11.99, LocalDate.now());
        MenuItem tiramisu = new MenuItem("Tiramisu", "dessert", "Tiramisu", 6.99, LocalDate.parse("2019-12-15"));
        MenuItem tiramisu2 = new MenuItem("Tiramisu", "dessert", "Tiramisu", 6.99, LocalDate.now());
        MenuItem fruitParfait = new MenuItem("Seasonal Fruit Parfait", "dessert", "Fruit parfait with local berries and peaches", 2.99, LocalDate.parse("2020-05-15"));

        Menu summerMenu = new Menu(summerMenuList, LocalDate.now());

        summerMenu.addItem(salad);
        summerMenu.addItem(beanBurger);
        summerMenu.addItem(hummus);
        summerMenu.addItem(beanSoup);
        summerMenu.addItem(veggieFajitas);
        summerMenu.addItem(fruitParfait);
        summerMenu.addItem(tiramisu);
        summerMenu.addItem(tiramisu2);

        summerMenu.printAllMenuItems();

        summerMenu.remove(tiramisu);

        summerMenu.printAllMenuItems();
    }
}







