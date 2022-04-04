package com.company.java1.paskaita9.arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> vardai = new ArrayList<>();
        vardai.add("Pirmas");
        vardai.add("Antras");
        vardai.add("Trecias");
        vardai.add("Ketvirtas");

        vardai.add(1, "Bananas");
        vardai.add(4, "Bananas");

        vardai.remove(2);

        System.out.println(vardai);
        System.out.println(vardai.size());
    }

}
