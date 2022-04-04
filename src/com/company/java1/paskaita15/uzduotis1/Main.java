package com.company.java1.paskaita15.uzduotis1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LyginisSkaicius lyginisSkaicius = new LyginisSkaicius();
        NelyginisSkaicius nelyginisSkaicius = new NelyginisSkaicius();
        NeigiamasSkaicius neigiamasSkaicius = new NeigiamasSkaicius();
        TeigiamasSkaicius teigiamasSkaicius = new TeigiamasSkaicius();

        List<Skaicius> skaiciai = List.of(lyginisSkaicius, nelyginisSkaicius, neigiamasSkaicius, teigiamasSkaicius);

        for(Skaicius skaicius: skaiciai) {
            run(skaicius);
        }

        System.out.println(lyginisSkaicius.suma());
        System.out.println(Arrays.toString(lyginisSkaicius.getMasyvas()));
        System.out.println("===========");

        System.out.println(nelyginisSkaicius.suma());
        System.out.println(Arrays.toString(nelyginisSkaicius.getMasyvas()));
        System.out.println("===========");

        System.out.println(neigiamasSkaicius.suma());
        System.out.println(Arrays.toString(neigiamasSkaicius.getMasyvas()));
        System.out.println("===========");

        System.out.println(teigiamasSkaicius.suma());
        System.out.println(Arrays.toString(teigiamasSkaicius.getMasyvas()));
        System.out.println("===========");

    }

    static void run(Skaicius skaicius) {
        skaicius.generuokMasyva();
    }

}
