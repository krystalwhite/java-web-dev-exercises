package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Program {

    Computer computer;
    Laptop laptop;
    SmartPhone smartPhone;

    @Before
    public void createComputerObject() {
        computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
    }

    @Before
    public void createLaptopObject() {
        laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
    }

    @Before
    public void createSmartPhoneObject() {
        smartPhone = new SmartPhone("Moto G Play", 3, 169.99, 6.5, false, 1, true);
    }

    @Test
    public void checkComputerName() {
        assertEquals(computer.getBrandName(), "Lenovo Thinkpad X1 Titanium Yoga");
    }

    @Test
    public void checkComputerRam() {
        assertEquals(computer.getRam(), 16);
    }

    @Test
    public void checkComputerPrice() {
        assertEquals(computer.getPrice(), 1769.40, 0.01);
    }

    @Test
    public void checkComputerScreenSize() {
        assertEquals(computer.getScreenSize(), 13.5, 0.01);
    }

    @Test
    public void checkLaptopName() {
        assertEquals(laptop.getBrandName(), "Lenovo Thinkpad X1 Titanium Yoga");
    }

    @Test
    public void checkIsTablet() {
        assertEquals(laptop.isTablet(), true);
    }

    @Test
    public void checkHasKeyboard() {
        assertEquals(laptop.isHasKeyboard(), true);
    }

    @Test
    public void checkHasBluetooth() {
        assertEquals(smartPhone.isHasBlueTooth(), true);
    }

    @Test
    public void checkWeight() {
        assertEquals(smartPhone.getWeight(), 1, 0.01);
    }



}