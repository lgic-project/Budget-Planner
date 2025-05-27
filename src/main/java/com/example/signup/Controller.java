package com.example.signup;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameInput;

    @FXML
    private TextField emailInput;

    @FXML
    private PasswordField passInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void handleSignUp() {
        String name = nameInput.getText();
        String email = emailInput.getText();
        String password = passInput.getText();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            resultLabel.setText("All fields are required!");
        } else {
            resultLabel.setText("Signed up successfully!");
        }
    }
}
