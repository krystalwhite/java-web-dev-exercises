package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone object1, Cone object2) {
        if (object1.getCost() - object2.getCost() < 0) {
         return -1;
        } else if (object1.getCost() - object2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
