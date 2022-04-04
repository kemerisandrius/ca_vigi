package com.company.java1.paskaita19.writestring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //try-with-resource
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/write_whole_string.txt"))) {
            bufferedWriter.write("Labas vakaras, Lietuva");
        } catch (IOException e) {
            System.out.println("Kažkas nutiko įrašant duomenis");
            System.exit(2);
        }
    }
}
