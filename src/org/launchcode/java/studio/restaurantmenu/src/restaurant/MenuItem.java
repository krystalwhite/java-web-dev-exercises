package restaurant;
import java.time.LocalDate;

public class MenuItem {

    private String category;
    private String description;
    private Double price;
    private Boolean newItem = false;

    public MenuItem (String category, String description, Double price, Boolean newItem) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
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


    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

//other methods



}
