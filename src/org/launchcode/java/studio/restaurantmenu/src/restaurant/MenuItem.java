package restaurant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

//    MenuItem includes price description, category (appetizer, main course, dessert), whether it's new or not

public class MenuItem {

    private String name;
    private String category;
    private String description;
    private Double price;
    private LocalDate dateCreated;
    private Boolean isNew;
    //private int dateCreated = new Date().getDay();

    public MenuItem (String name, String category, String description, Double price, LocalDate dateCreated) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateCreated = dateCreated;
        this.isNew = isNew;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDateCreated() { return dateCreated; }

    public void setDateCreated(LocalDate dateCreated) { this.dateCreated = dateCreated; }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNewItem(Boolean isNewItem) {
        this.isNew = isNewItem;
    }

    public void checkItemNew() {
        long noOfDaysBetween = ChronoUnit.DAYS.between(getDateCreated(), LocalDate.now());
        if (noOfDaysBetween > 30) {
            this.isNew = false;
        } else {
            this.isNew = true;
        }
    }

    public void printMenuItem() {
        checkItemNew();
        if (this.isNew == true) {
            System.out.printf("New Item: ");
        }
        System.out.println(this.getDescription() + " ..... $" + this.getPrice());
    }

       @Override
    public boolean equals(Object item) {
        if (this == item) return true;
        if (item == null || getClass() != item.getClass()) return false;
        MenuItem menuItem = (MenuItem) item;
        return Objects.equals(name, menuItem.name) && Objects.equals(category, menuItem.category) && Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, description, price);
    }


    }


