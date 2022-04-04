package com.company.java1.paskaita19.writestring;

import java.io.IOException;

public class MyWordWriterMain {

    public static void main(String[] args) throws IOException {
        MyWordWriter myWordWriter = new MyWordWriter("files/my_words.txt");

        myWordWriter.writeString("Labas");
    }
}
