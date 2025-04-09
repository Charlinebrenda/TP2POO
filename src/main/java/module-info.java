module com.example.tp2poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tp2poo to javafx.fxml;
    exports com.example.tp2poo;
}