package com.company.paskaita19.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("files/original.txt");
            FileOutputStream outputStream = new FileOutputStream("files/copy.txt");

            for (int data; (data = inputStream.read()) != -1; ) {
                outputStream.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Failo nera");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Klaida bandant skaityt arba rasyti");
            System.exit(2);
        }
    }

}