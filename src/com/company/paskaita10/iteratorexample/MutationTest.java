package com.company.paskaita10.iteratorexample;

import java.util.ArrayList;

public class MutationTest {

    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();
        sarasas.add("aaa");
        sarasas.add("bbb");

        for (String str: sarasas) {
            str = "ccc";
        }
    }
}
