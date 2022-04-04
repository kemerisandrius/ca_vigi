package com.company.java1.paskaita8.stringbuilderexample;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tekstas");

        int indexOfS = sb.indexOf("s");
        int indexOfSFrom4 = sb.indexOf("s", 4);
        System.out.println(indexOfS);
        System.out.println(indexOfSFrom4);

        int lastIndexOfT = sb.lastIndexOf("t");
        int lastIndexOfTFrom3 = sb.lastIndexOf("t", 3);
        System.out.println(lastIndexOfT);
        System.out.println(lastIndexOfTFrom3);

    }
}
