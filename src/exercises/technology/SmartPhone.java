package exercises.technology;

public class SmartPhone extends Computer {
    private boolean hasBlueTooth;
    private int candyCrushLives;
    private int numberOfContacts;


    public SmartPhone(String brandName, int ram, double price, double screenSize, boolean hasKeyboard, double weight, boolean hasBlueTooth) {
        super(brandName, ram, price, screenSize, hasKeyboard, weight);
                this.hasBlueTooth = hasBlueTooth;
    }

    public boolean isHasBlueTooth() {
        return hasBlueTooth;

    }

    public void setHasBlueTooth(boolean hasBlueTooth) {
        this.hasBlueTooth = hasBlueTooth;
    }

    public int getCandyCrushLives() {
        return candyCrushLives;
    }

    public void setCandyCrushLives(int candyCrushLives) {
        this.candyCrushLives = candyCrushLives;
    }

    public void setNumberOfContacts(int numberOfContacts) {
        this.numberOfContacts = numberOfContacts;
    }

    public void addContact(String name, int phoneNumber) {
        this.numberOfContacts += 1;
    }

    public int getNumberOfContacts() {
        return this.numberOfContacts;
    }

    public void loseCandyCrushLife() {
        this.candyCrushLives -= 1;
    }
}
