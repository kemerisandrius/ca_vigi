package com.company.paskaita9.arraylist.uzduotis2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();

        sarasas.add("trumpaszodis");
        sarasas.add("patsilgiausiaszodis");
        sarasas.add("labaiilgaszodis");

        String ilgiausiasZodis = "";
        for (String zodis: sarasas) {
            if (ilgiausiasZodis.length() < zodis.length()) {
                ilgiausiasZodis = zodis;
            }
        }
        System.out.println(ilgiausiasZodis);
    }
}
