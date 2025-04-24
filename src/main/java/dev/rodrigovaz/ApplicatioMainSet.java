package dev.rodrigovaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class ApplicatioMainSet {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(new HashSet<>(Arrays.asList(3d, 2d, 4d
                , 6d, 7d, 8d, 9d, 12321d,
                45324+52d, 454543d)));
        Set<Double> sets = conjunto.getSets();
        System.out.println(Collections.max(sets));
    }
}
