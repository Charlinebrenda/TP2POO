package com.example.tp2poo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Telephonett {
        public List<Telephone> afficherE() {
            List<Telephone> livres = new ArrayList<>();
            String query = "SELECT * FROM Telephone";
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(query);
                 ResultSet res = pstmt.executeQuery()) {
                while (res.next()) {
                    Telephone telephone = new Telephone(
                            res.getString("id"),
                            res.getString("se"),
                            res.getDate("dachat"),
                            res.getString("couleur"),
                            res.getString("sim"),
                            res.getString("ecran"),
                            res.getString("modele"),
                            res.getString("marque"),
                            res.getString("connectivite")
                    );
                    livres.add(telephone);
                }
            } catch (SQLException e) {
                System.err.println("Erreur lors de l'affichage des Telephones  : " + e.getMessage());
            }
            return livres;
        }
        public void ajouterE(String se, String marque, LocalDate dachat, String ecran, String id, String couleur, String modele, String connectivite, String sim) {
            String query = "INSERT INTO Telephone (se,marque,dachat,ecran,id,couleur,modele,connectivite,sim) VALUES (?, ?, ?,?,?,?,?,?,?)";

            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1,id);
                pstmt.setString(2,se);
                pstmt.setDate(3, Date.valueOf(dachat));
                pstmt.setString(4, marque);
                pstmt.setString(5,couleur);
                pstmt.setString(6,modele);
                pstmt.setString(7,ecran);
                pstmt.setString(8,connectivite);
                pstmt.setString(9,sim);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Telephone volé ajouté avec succès !");
                }
            } catch (SQLException e) {
                System.err.println("Erreur lors de l'ajout du Telephone volé : " + e.getMessage());
            }
        }

    }
