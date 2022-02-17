package com.company.paskaita19.serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Issaugoti suserializuota objekta faile
        FileOutputStream outputStream = new FileOutputStream("files/person_a");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person = new Person("Petras", "Kurmelis");
        objectOutputStream.writeObject(person);
    }
}
