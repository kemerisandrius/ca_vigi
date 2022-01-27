package com.company.paskaita9.arraylist.uzduotis3;

import java.util.ArrayList;

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

        for (int i = 0; i < sarasas.size(); i++) {
            String zodis = sarasas.get(i);
            for (int j = i + 1; j < sarasas.size(); j++) {
                if (zodis.equals(sarasas.get(j))) {
                    sarasas.remove(j);
                }
            }
        }

        // Surasti raides kurios turi duplikatus
        //        boolean yraDuplikatu = true;
        //        int i = 0;
        //        while (i < 20) {
        //            String zodis = sarasas.get(i);
        //            if (raidePasikartoja(zodis, sarasas)) {
        //                sarasas.removeIf(raide -> raide.equals(zodis));
        //            }
        //            if (i == sarasas.size() - 1 && sarasas.size()-1 != 0) {
        //                i = 0;
        //            } else {
        //                if (sarasas.size() == 1) {
        //                    break;
        //                }
        //                i++;
        //            }
        //        }
        ArrayList<String> antrasSarasas = new ArrayList<>();
        for (String zodis : sarasas) {
            if (!antrasSarasas.contains(zodis)) {
                antrasSarasas.add(zodis);
            }
        }

        // Tas raides pasalinti
        //        System.out.println(sarasas);
    }

    public static boolean raidePasikartoja(String zodis, ArrayList<String> sarasas) {
        return sarasas.indexOf(zodis) != sarasas.lastIndexOf(zodis);
    }
}
