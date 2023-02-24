package com.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("calculadora-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Calculadora");
        Image image = new Image("file:src/main/resources/img/icon.png");
        stage.getIcons().add(image);
        stage.setScene(scene);
        String css;
        if (!CalculadoraController.isModoDaltonico()) {
            css = this.getClass().getResource("/css/normal-view.css").toExternalForm();
        } else {
            css = this.getClass().getResource("/css/daltonic-view.css").toExternalForm();
        }
        scene.getStylesheets().add(css);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}