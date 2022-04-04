package com.company.java1.paskaita19.bufferedreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("files/my_words.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
