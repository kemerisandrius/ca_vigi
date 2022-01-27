package com.company.paskaita9.arraylist.uzduotis1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ivesk zodi");

            String vartotojoIvestasZodis = scanner.next();

            if (sarasas.contains(vartotojoIvestasZodis)) {
                System.out.println("Toks zodis jau yra");
                continue;
            }

            if (sarasas.size() == 5) {
                sarasas.clear();
            }

            sarasas.add(vartotojoIvestasZodis);

            System.out.println(sarasas);
        }
    }

}
