package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private void onHelloButtonClick(ActionEvent event) throws IOException {
        // Load homepage.fxml when Submit button is clicked
        Parent homepageRoot = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene homepageScene = new Scene(homepageRoot);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(homepageScene);
        stage.setTitle("Homepage - Budget Planner");
    }
}
