package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Homepage
        FXMLLoader homepageLoader = new FXMLLoader(getClass().getResource("/com/example/demo/homepage.fxml"));
        Scene homepageScene = new Scene(homepageLoader.load());
        Stage homepageStage = new Stage();
        homepageStage.setTitle("Homepage - Budget Planner");
        homepageStage.setScene(homepageScene);
        homepageStage.show();
//
//        // Account
//        FXMLLoader accountLoader = new FXMLLoader(getClass().getResource("/com/example/demo/Account.fxml"));
//        Scene accountScene = new Scene(accountLoader.load());
//        Stage accountStage = new Stage();
//        accountStage.setTitle("Account - Budget Planner");
//        accountStage.setScene(accountScene);
//        accountStage.show();
//
//        // Budget
//        FXMLLoader budgetLoader = new FXMLLoader(getClass().getResource("/com/example/demo/Budget.fxml"));
//        Scene budgetScene = new Scene(budgetLoader.load());
//        Stage budgetStage = new Stage();
//        budgetStage.setTitle("Budget/Goals - Budget Planner");
//        budgetStage.setScene(budgetScene);
//        budgetStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
