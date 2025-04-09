package com.example.tp2poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DatabaseConnection {
        private static final String URL="jdbc:mysql://localhost:5000/POOTP2?usesSSL=true";
        private static final String USER="root";
        private static final String PASSWORD="jodhqqkbqr";
        public static Connection getConnection() throws SQLException {
            try {
                return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.err.println("Erreur de connexion à la base de données:" + e.getMessage());
                throw e;
            }
        }
    }


