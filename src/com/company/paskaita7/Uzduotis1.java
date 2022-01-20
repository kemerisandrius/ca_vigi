package com.company.paskaita7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Uzduotis1 {

    public static void main(String[] args) {
        String formattedDateTime = LocalDateTime.now()
                .minusHours(3)
                .plusDays(5)
                .format(DateTimeFormatter.ofPattern("yyyy MM dd HH:mm"));

        System.out.println(formattedDateTime);
    }
}
