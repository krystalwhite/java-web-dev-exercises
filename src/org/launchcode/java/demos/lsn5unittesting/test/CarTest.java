package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.launchcode.java.demos.lsn5unittesting.main.Car;


public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), 0.001);
    }

    @Test
    public void testInitialGasTank2() {
        assertFalse(test_car.getGasTankLevel() == 0);
    }

    @Test
    public void testInitialGasTank3() {
        assertTrue(test_car.getGasTankLevel() == 10);
    }

    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), 0.001);
    }

//    not as good because it doesn't actually test gas tank but the effects of the gas tank
//    something else could have caused the odometer to stop at 500 maybe
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(550);
        assertTrue(test_car.getOdometer() == 500);
    }

    @Test
    public void testGasTankAfterExceedingTankRange2() {
        test_car.drive(550);
        assertEquals(test_car.getGasTankLevel(), 0, 0.001);
    }




}
