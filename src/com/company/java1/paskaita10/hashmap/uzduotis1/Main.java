package com.company.java1.paskaita10.hashmap.uzduotis1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> skaiciai = new HashMap<>();
        skaiciai.put(11, "vienuolika");
        skaiciai.put(12, "dvylika");
        skaiciai.put(100, "šimtas");
        System.out.println(skaiciai);

        System.out.println("Ar mape yra 13?: " + (skaiciai.containsKey(13) ? "Taip" : "Ne"));
        System.out.println("Ar mape yra šimtas?: " + (skaiciai.containsValue("šimtas") ? "Taip" : "Ne"));

        System.out.println("12 žodžiais yra: " + skaiciai.get(12));

        spausdintiMap(skaiciai);
        skaiciai.remove(11);

        spausdintiMap(skaiciai);
        skaiciai.clear();

        spausdintiMap(skaiciai);
    }

    private static void spausdintiMap(HashMap<Integer, String> skaiciai) {
        System.out.println("==========");
        for (Map.Entry<Integer, String> mapEntry : skaiciai.entrySet()) {
            System.out.println(String.format("Raktas: %s Reikšmė: %s", mapEntry.getKey(), mapEntry.getValue()));
        }
    }
}
