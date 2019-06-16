package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetSorter implements Comparator<Pets> {


    @Override
    public int compare(Pets o1, Pets o2) {
            if (o2.type.toLowerCase().compareTo(o1.type.toLowerCase()) > 0) {
                return 1;
            } else if (o2.type.toLowerCase().compareTo(o1.type.toLowerCase()) < 1) {
                return -1;
            } else {
                if (o2.name.compareTo(o1.name) > 0) {
                    return 1;
                } else if (o2.name.compareTo(o1.name) < 1) {
                    return -1;
                } else
                    return 0;

            }
        }
    }

