package com.company.paskaita17.nullexample;

public class Main {

    public static void main(String[] args) {
        String zodis = null;

        System.out.println(gautiZodzioIlgi(zodis));
    }

    static int gautiZodzioIlgi(String zodis) {
        if (zodis != null) {
            return zodis.length();
        }

        return -1;
    }

}
