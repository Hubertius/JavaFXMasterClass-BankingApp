module com.java.mazebank.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;

    opens com.java.mazebank to javafx.fxml;
    exports com.java.mazebank;
    exports com.java.mazebank.controllers;
    exports com.java.mazebank.controllers.admin;
    exports com.java.mazebank.controllers.client;
    exports com.java.mazebank.models;
    exports com.java.mazebank.views;
}