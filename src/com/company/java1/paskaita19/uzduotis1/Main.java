package com.company.java1.paskaita19.uzduotis1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //1. Nuskaityti failą
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/vardas.txt"))) {
            String vardas = bufferedReader.readLine();

            //2. Apversti stringą
            StringBuilder sb = new StringBuilder(vardas);
            sb.reverse();

            //3. Įrašyti į kitą failą
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/vardas_result.txt"))) {
                bufferedWriter.write(sb.toString());
            }
        } catch (IOException e) {
            System.out.println("Nepavyko nuskaityti failo");
        }
    }

}
