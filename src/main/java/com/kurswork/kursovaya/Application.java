package com.kurswork.kursovaya;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("configurationView.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("configurationStyle.css").toExternalForm());
        stage.setTitle("Configuration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}