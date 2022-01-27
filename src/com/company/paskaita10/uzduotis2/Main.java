package com.company.paskaita10.uzduotis2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> zodziai = new ArrayList<>();
        zodziai.add("lapas");
        zodziai.add("namas");
        zodziai.add("obuolys");

        int kelintasYraNamas = zodziai.indexOf("namas");
        System.out.println("Namo indeksas sarase yra: " + kelintasYraNamas);

        zodziai.remove("obuolys");
        System.out.println(zodziai);

        zodziai.clear();
        System.out.println(zodziai);
    }
}
