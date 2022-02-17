package com.company.paskaita19.writestring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWordWriter {
    private final BufferedWriter bufferedWriter;

    public MyWordWriter(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        this.bufferedWriter = new BufferedWriter(fileWriter);
    }

    public void writeString(String words) throws IOException {
       bufferedWriter.write(words);
       bufferedWriter.flush();
    }
}
