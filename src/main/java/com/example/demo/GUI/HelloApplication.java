package com.example.demo.GUI;

import javafx.application.Application;
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

    public static void main(String[] args) {
        launch(args);
    }
}