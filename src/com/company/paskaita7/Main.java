package com.company.paskaita7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dataIrLaikas = LocalDateTime.now();
        int darboPradziaVal = 8;
        int darboPabaigaVal = 17;

        System.out.println(dataIrLaikas.getMonth());

        if (dataIrLaikas.getHour() > darboPradziaVal && dataIrLaikas.getHour() < darboPabaigaVal) {
            System.out.println("Dabar yra darbo metas");
        } else {
            System.out.println("Dabar nera darbo metas");
        }

        System.out.println(dataIrLaikas.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dataIrLaikas.format(DateTimeFormatter.ofPattern("yyyy")));
    }
}
