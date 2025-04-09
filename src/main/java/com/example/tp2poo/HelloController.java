package com.example.tp2poo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloController extends VBox {
    private int space;

    public HelloController(int space) {
        this.space = 10;
        Button bouton1 = new Button("Telephone");
        Button bouton2 = new Button("Ordinateur");
        bouton1.setMaxWidth(1500);
        bouton2.setMaxWidth(1500);
        bouton1.setOnAction(actionEvent -> click1());
        bouton2.setOnAction(actionEvent -> click2());

        this.getChildren().addAll(bouton1, bouton2);

    }

    private void click1() {
        Stage stage = new Stage();
        Scene scene = new Scene(new Telephonef());
        stage.setWidth(440);
        stage.setHeight(340);
        stage.setTitle("etudiant");
        stage.setScene(scene);
        stage.show();
    }

    private void click2() {
        Stage stage = new Stage();
        Scene scene = new Scene(new Telephonef());
        stage.setWidth(440);
        stage.setHeight(340);
        stage.setTitle("Ordinateur");
        stage.setScene(scene);
        stage.show();
    }
}