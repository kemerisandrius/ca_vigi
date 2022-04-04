package com.company.java1.paskaita10.iteratorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();

        sarasas.add("a");
        sarasas.add("b");
        sarasas.add("c");
        sarasas.add("a");
        sarasas.add("b");
        sarasas.add("c");
        sarasas.add("d");

        ArrayList<String> antrasSarasas = new ArrayList<>();
        antrasSarasas.add("zzz");
        antrasSarasas.add("hgggg");

        sarasas.addAll(antrasSarasas);

        Collections.swap(sarasas, 2, 5);

        Iterator<String> sarasasIterator = sarasas.iterator();
        while (sarasasIterator.hasNext()) {
            System.out.println(sarasasIterator.next());
        }

        Collections.sort(sarasas, Collections.reverseOrder());
        System.out.println(sarasas);
    }
}
