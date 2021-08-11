package exercises.technology;

public class Laptop extends Computer {
    private boolean isTablet;
    private boolean hasStylus;

    public Laptop (String brandName, int ram, double price, double screenSize, boolean hasKeyboard, double weight, boolean isTablet, boolean hasStylus) {
        super(brandName, ram, price, screenSize, hasKeyboard, weight);
        this.isTablet = isTablet;
        this.hasStylus = hasStylus;
    }

    public boolean isTablet() {
        return isTablet;
    }

    public void setTablet(boolean tablet) {
        isTablet = tablet;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    public boolean needsCarryingCase() {
        if (this.getWeight() > 7) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canSignDocuments() {
        if (this.isTablet == true || this.hasStylus == true) {
            return true;
        } else {
            return false;
        }
    }

}
