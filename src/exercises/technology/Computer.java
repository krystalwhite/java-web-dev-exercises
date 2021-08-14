package exercises.technology;

public class Computer extends AbstractEntity{
    private String brandName;
    private int ram;
    private double price;
    private double screenSize;
    private boolean hasKeyboard;
    private double weight;

    public Computer (String brandName, int ram, double price, double screenSize, boolean hasKeyboard, double weight) {
        this.brandName = brandName;
        this.ram = ram;
        this.price = price;
        this.screenSize = screenSize;
        this.hasKeyboard = hasKeyboard;
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    public void addMoreRam (int newRam) {
        this.ram += newRam;
    }

    public void goOnSale (double percentDecrease) {
        this.price = this.price*(100 - percentDecrease)/100;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
