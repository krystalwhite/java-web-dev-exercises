package org.launchcode.java.demos.lsn6inheritance.test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
        public void inheritsSuperInFirstConstructor() {
            HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
            assertEquals(7, keyboardCat.getWeight(), .001);
        }
}
