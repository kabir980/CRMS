package com.example.crms.controllers;

import com.example.crms.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginController implements IRootController {

    private MainApplication mainApp;
    @FXML
    private TextField txf_username;
    @FXML
    private TextField txf_password;
    @FXML
    private Label hintLabel;
    @FXML
    private ImageView loginIcon;
    @FXML
    private AnchorPane rootPane;

    public void setMainApp(MainApplication mainApp) {
        this.mainApp = mainApp;
    }

    public void loginButton(ActionEvent actionEvent) throws IOException {

        String username = txf_username.getText();
        String password = txf_password.getText();



        if (username.isEmpty() || password.isEmpty()) {
            hintLabel.setText("Please enter the email or password");
        }
        if (!username.isBlank() || !password.isBlank()) {
            hintLabel.setText("Thank you so much");
        }

    }
}
