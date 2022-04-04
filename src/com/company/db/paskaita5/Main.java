package com.company.db.paskaita5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:h2:~/test",
                "sa",
                ""
            );
        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti");
            e.printStackTrace();
        }
    }
}
