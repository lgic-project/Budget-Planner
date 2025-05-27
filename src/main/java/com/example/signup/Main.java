package com.example.signup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML layout
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        Parent root = loader.load();

        // Create the scene with the loaded layout
        Scene scene = new Scene(root, 1024, 768);

        // Apply the external CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set up the stage
        primaryStage.setTitle("Signup Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
