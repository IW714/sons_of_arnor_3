package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Scanner;

//This is where we are putting in the actual code for the game
public class GameStage extends Stage {
    Label x = new Label("Second Stage");
    VBox y = new VBox();

    GameStage(){
        y.getChildren().add(x);
        this.setScene(new Scene(y, 600, 400));
        this.show();
        Scanner UI = new Scanner(System.in);
        System.out.println("Welcome to Sons of Arnor, a choose your own adventure game. What is your name?");
    }
}
