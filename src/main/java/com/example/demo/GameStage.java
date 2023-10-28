package com.example.demo;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class GameStage extends Stage {
    Label x = new Label("Game");
    VBox y = new VBox();

    private TextArea output = new TextArea();
    private TextField input = new TextField();
    private Map<String, Command> commands = new HashMap<>();

    private Parent createContent() {
        output.setPrefHeight(600-80);
        output.setFont(Font.font(24));

        input.setOnAction(e -> {
            String inputText = input.getText();
            input.clear();

            onInput(inputText);
        });

        VBox root = new VBox(15, output, input);
        root.setPadding(new Insets(15));
        root.setPrefSize(800,600);

        initGame();

        return root;
    }

    private void initGame() {
        println("Welcome to --Sons of Arnor 3-- PROTOTYPE");
        initCommands();
    }

    private void initCommands() {
        commands.put("exit", new Command("exit", "Exit the game", Platform::exit));
    }

    private void println(String line) {
        output.appendText(line + "\n");
    }

    private void onInput(String line) {
        if (!commands.containsKey(line)) {
            println("Command " + line + " not found");
            return;
        }
        commands.get(line).execute();
    }

    GameStage(){
//        y.getChildren().add(x);
//        this.setScene(new Scene(y, 600, 400));
//        this.show();
        this.setScene(new Scene(createContent()));
        this.show();
    }
}
