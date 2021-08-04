package restaurant;
import java.time.LocalDate;

//    MenuItem includes price description, category (appetizer, main course, dessert), whether it's new or not

public class MenuItem {

    private String category;
    private String description;
    private Double price;
    private Boolean isNewItem = false;

    public MenuItem (String category, String description, Double price, Boolean isNewItem) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNewItem = isNewItem;
    }

//    getters and setters for Menu Items
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

    public Boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(Boolean isNewItem) {
        this.isNewItem = isNewItem;
    }

//other methods



}
