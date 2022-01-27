package com.company.paskaita10.hashset;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // Aibes sukurimas
        HashSet<String> aibe = new HashSet<String>();

        // Elementu idejimas i aibe
        aibe.add("Apple");
        aibe.add("Mango");
        aibe.add("Grapes");
        aibe.add("Orange");
        aibe.add("Fig");

        System.out.println(aibe);

        // Dedame pasikartojancius el., bet niekas nepasikeis
        aibe.add("Apple");
        aibe.add("Mango");

        System.out.println(aibe);
    }

}
