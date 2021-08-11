package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Program {

    @Before
    public void createComputerObject() {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
    }

    @Before
    public void createLaptopObject() {
        Laptop laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
    }

    @Before
    public void createSmartPhoneObject() {
        SmartPhone smartPhone = new SmartPhone("Moto G Play", 3, 169.99, 6.5, false, 1, true);
    }

    @Test
    public void checkComputerName() {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
        assertEquals(computer.getBrandName(), "Lenovo Thinkpad X1 Titanium Yoga");
    }

    @Test
    public void checkComputerRam() {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
        assertEquals(computer.getRam(), 16);
    }

    @Test
    public void checkComputerPrice() {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
        assertEquals(computer.getPrice(), 1769.40);
    }

    @Test
    public void checkComputerScreenSize() {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
        assertEquals(computer.getScreenSize(), 13.5, 0.01);
    }

    @Test
    public void checkLaptopName() {
        Laptop laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
        assertEquals(laptop.getBrandName(), "Lenovo Thinkpad X1 Titanium Yoga");
    }

    @Test
    public void checkIsTablet() {
        Laptop laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
        assertEquals(laptop.isTablet(), true);
    }

    @Test
    public void checkHasKeyboard() {
        Laptop laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
        assertEquals(laptop.isHasKeyboard(), true);
    }

    @Test
    public void checkHasBluetooth() {
        SmartPhone smartPhone = new SmartPhone("Moto G Play", 3, 169.99, 6.5, false, 1, true);
        assertEquals(smartPhone.isHasBlueTooth(), true);
    }

    @Test
    public void checkWeight() {
        SmartPhone smartPhone = new SmartPhone("Moto G Play", 3, 169.99, 6.5, false, 1, true);
        assertEquals(smartPhone.getWeight(), 1, 0.01);
    }



}