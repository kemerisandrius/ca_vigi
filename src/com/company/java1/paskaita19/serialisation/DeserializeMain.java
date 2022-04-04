package com.company.java1.paskaita19.serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Is failo perskaityt ir deserializuoti objekta i programa
        FileInputStream inputStream = new FileInputStream("files/person_a");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Person personFromFile = (Person) objectInputStream.readObject();

        //Isitikinti kad nuskaityta is failo
        System.out.println(personFromFile.toString());
    }

}
