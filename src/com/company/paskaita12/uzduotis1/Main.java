package com.company.paskaita12.uzduotis1;

public class Main {

    public static void main(String[] args) {
        Vaisius vaisius = new Vaisius();


        EgzotinisVaisius egzotinisVaisius = new EgzotinisVaisius();
        LietuviskasVaisius lietuviskasVaisius = new LietuviskasVaisius();

        egzotinisVaisius.kasAsEsu();
        lietuviskasVaisius.kasAsEsu();
    }

}
