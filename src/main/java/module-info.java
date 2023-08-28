module com.example.crms {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.crms to javafx.fxml;
    exports com.example.crms;
    exports com.example.crms.controllers;
    opens com.example.crms.controllers to javafx.fxml;
}