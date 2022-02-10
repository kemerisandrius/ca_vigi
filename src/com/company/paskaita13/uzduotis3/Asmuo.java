package com.company.paskaita13.uzduotis3;

import java.util.Objects;

public class Asmuo {

    private String vardas;
    private String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Asmuo asmuo = (Asmuo) o;
        return Objects.equals(vardas, asmuo.vardas) && Objects.equals(pavarde, asmuo.pavarde);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vardas, pavarde);
    }
}
