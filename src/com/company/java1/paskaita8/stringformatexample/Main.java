package com.company.java1.paskaita8.stringformatexample;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        int totalShots = 4;
        String direction = "vakarai";

        String tankoInfo1 = "Tankas yra kordinatese { x: " + x + ", y: " + y + " }, isviso suviu: " + totalShots + " ziuri i "+ direction;
        String tankoInfo = String.format("Tankas yra koordinatese { x: %d, y: %d }, iš viso šūviu: %d, žiūri į: %s", x, y, totalShots, direction);

        System.out.println(tankoInfo1);
        System.out.println(tankoInfo);
    }
}
