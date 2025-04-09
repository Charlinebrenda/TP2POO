package com.example.tp2poo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.Date;
import java.time.LocalDate;

public class Telephonef extends BorderPane {
    public Telephonef(){
        HBox cont=new HBox(10);
        VBox fill= new VBox(10);
        Label L1= new Label("numeroserie");
        TextField T1= new TextField();
        cont.getChildren().addAll(L1,T1);
        HBox cont2=new HBox(10);
        Label L2= new Label("Marque");
        TextField T2= new TextField();
        cont2.getChildren().addAll(L2,T2);
        HBox cont3=new HBox(10);
        Label L3= new Label("date_achat");
        DatePicker datePicker=new DatePicker();
        cont3.getChildren().addAll(L3,datePicker);
        HBox cont4=new HBox(10);
        Label L4= new Label("se");
        TextField T4= new TextField();
        cont4.getChildren().addAll(L4,T4);
        HBox cont5=new HBox(10);
        Label L5= new Label("modele");
        TextField T5= new TextField();
        cont5.getChildren().addAll(L5,T5);
        HBox cont6=new HBox(10);
        Label L6= new Label("couleur");
        TextField T6= new TextField();
        cont6.getChildren().addAll(L6,T6);
        HBox cont7=new HBox(10);
        Label L7= new Label("Connectivite");
        TextField T7= new TextField();
        cont7.getChildren().addAll(L7,T7);
        HBox cont8=new HBox(10);
        Label L8= new Label("SIM");
        TextField T8= new TextField();
        cont8.getChildren().addAll(L8,T8);
        HBox cont9=new HBox(10);
        Label L9= new Label("ecran");
        TextField T9= new TextField();
        cont9.getChildren().addAll(L9,T9);
        Button B1= new Button("Signale objet voler");
        Button B2= new Button("Acheter onjet");

        fill.getChildren().addAll(cont,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,B1,B2);
        this.setRight(fill);
        String id= T1.getText();
        String marque=T2.getText();
        LocalDate dachat=datePicker.getValue();
        String se=T4.getText();
        String modele=T5.getText();
        String couleur=T6.getText();
        String connectivite=T7.getText();
        String sim=T8.getText();
        String ecran=T9.getText();
        Telephonett telephone= new Telephonett ();
       B1.setOnAction(actionEvent -> telephone.ajouterE(se,marque,dachat,ecran,id,couleur,modele,connectivite,sim));
        //crée Tableau
        TableColumn<Telephone,String> Id=new TableColumn<>("Id");
        Id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Telephone,String>SE=new TableColumn<>("SE");
        SE.setCellValueFactory(new PropertyValueFactory<>("se"));
        TableColumn<Telephone, Date> Date_achat=new TableColumn<>("Date_achat");
        Date_achat.setCellValueFactory(new PropertyValueFactory<>("dachat"));
        TableColumn<Telephone,String> Marque=new TableColumn<>("Marque");
        Marque.setCellValueFactory(new PropertyValueFactory<>("marque"));
        TableColumn<Telephone,String> Modele=new TableColumn<>("Modele");
        Modele.setCellValueFactory(new PropertyValueFactory<>("modele"));
        TableColumn<Telephone,String> Ecran=new TableColumn<>("Ecran");
       Ecran.setCellValueFactory(new PropertyValueFactory<>("ecran"));
        TableColumn<Telephone,String> Couleur=new TableColumn<>("Couleur");
        Couleur.setCellValueFactory(new PropertyValueFactory<>("couleur"));
        TableColumn<Telephone,String>Connectivite=new TableColumn<>("Connective");
        Connectivite.setCellValueFactory(new PropertyValueFactory<>("conectivite"));
        TableColumn<Telephone,String> SIM=new TableColumn<>("SIM");
        SIM.setCellValueFactory(new PropertyValueFactory<>("sim"));
        //remplir le tableau
        ObservableList<Telephone> items= FXCollections.observableArrayList(telephone.afficherE());
        TableView<Telephone> tableau=new TableView<>(items);
        tableau.getColumns().addAll(Id,SE,Date_achat, Marque, Modele, Ecran,Couleur,Connectivite,SIM);
        this.setCenter(tableau);
     }
}
