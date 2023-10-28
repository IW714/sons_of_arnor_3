package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        final int HEIGHT = 600;
//        final int WIDTH = 800;
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//
//        StackPane start = new StackPane();
//        StackPane root = new StackPane();
//        Canvas canvas = new Canvas(WIDTH, HEIGHT);
//
//        Scene scene = new Scene(fxmlLoader.load(), WIDTH, HEIGHT, Color.NAVY);
//
//        Scene startMenu = new Scene(start, WIDTH, HEIGHT, Color.BLACK);
//
//        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.BLACK);
//        stage.setTitle("Sons_of_Arnor_3.exe");
//
//        stage.setScene(scene);
//        stage.show();

        // new StartStage();
        new GameStage();
    }

    public void game(Stage stage) throws IOException {
        StackPane root = new StackPane();

        Scene gameUI = new Scene(root, 600, 400);

        stage.setScene(gameUI);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}