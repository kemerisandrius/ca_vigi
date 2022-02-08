package com.company.paskaita12.protectedexmaple;

public class Studentas extends Asmuo {

    private final String studentoPazymejimooNr;

    public Studentas(String vardas, String pavarde, String studentoPazymejimooNr) {
        super(vardas, pavarde);
        this.studentoPazymejimooNr = studentoPazymejimooNr;
    }

    public void printInfo() {
        System.out.println(vardas);
    }

    @Override
    public String toString() {
        return "Studentas{" +
            "vardas='" + vardas + '\'' +
            ", pavarde='" + pavarde + '\'' +
            ", studentoPazymejimooNr='" + studentoPazymejimooNr + '\'' +
            '}';
    }
}
