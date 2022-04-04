package com.company.java1.paskaita21.varargs;

public class Main {

    public static void main(String[] args) {
        int suma1 = sudetiSkaicius(1, 2);
        int suma2 = sudetiSkaicius(1, 2, 3, 4);
        int suma3 = sudetiSkaicius(1, 2, 3, 4, 5);
        int suma4 = sudetiSkaicius(1, 2, 3, 4, 5, 6);

        int[] skaiciai = {2, 4, 5, 6};

        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);
        System.out.println(suma4);
    }

    public static int sudetiSkaicius(int... skaiciai) {
        int rezultatas = 0;
        for (int skaicius: skaiciai) {
            rezultatas += skaicius;
        }

        return rezultatas;
    }

    public static int sudetiSkaiciusMasyve(int[] skaiciai) {
        int rezultatas = 0;
        for (int skaicius: skaiciai) {
            rezultatas += skaicius;
        }

        return rezultatas;
    }
}
