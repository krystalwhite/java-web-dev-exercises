package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor object1, Flavor object2) {
        return object1.getName().compareTo(object2.getName());
    }


}
