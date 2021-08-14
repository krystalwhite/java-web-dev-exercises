package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();


        System.out.println("Before sorting alphabetically by name:" + flavors);
        flavors.sort(comparator);
        System.out.println("After sorting: " + flavors);


        System.out.println("Before sorting by cost:" + cones);
        cones.sort(new ConeComparator());
        System.out.println("After sorting: " + cones);

    }
}
