package com.company.paskaita10.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> mapas = new HashMap();
        mapas.put(1, "vienas");
        mapas.put(2, "du");
        mapas.put(3, "trys");
        mapas.put(4, "keturi");
        mapas.put(5, "penki");
        mapas.put(6, "sesi");

        Set<Integer> raktai = mapas.keySet();
        System.out.println(raktai);

        for (Map.Entry<Integer, String> mapoIrasas : mapas.entrySet()) {
            System.out.println(" - - - - - ");
            System.out.println("Raktas yra: " + mapoIrasas.getKey());
            System.out.println("Reiksme yra: " + mapoIrasas.getValue());
        }

        String istrintasElementas = mapas.remove(1);
        System.out.println(istrintasElementas);

        Iterator<Map.Entry<Integer, String>> iterator = mapas.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> mentry = iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is:");
            System.out.println(mentry.getValue());
        }
    }
}
