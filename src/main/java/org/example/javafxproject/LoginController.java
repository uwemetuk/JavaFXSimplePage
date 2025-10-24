package org.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onSubmitButtonClick() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            resultLabel.setText("Please fill in both fields.");
        } else {
            resultLabel.setText("Email: " + email + "\nPassword: " + password);
            emailField.clear();
            passwordField.clear();
        }
    }
}
