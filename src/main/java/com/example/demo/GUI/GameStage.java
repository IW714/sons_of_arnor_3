package com.example.demo.GUI;

import com.example.demo.Game;
import com.example.demo.GameImpl;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class GameStage extends Stage {
    Label x = new Label("Game");
    VBox y = new VBox();

    private static TextArea output = new TextArea();
    private TextField input = new TextField();
    private Map<String, Command> commands = new HashMap<>();
    private Game game;

    private Parent createContent() {
        output.setPrefHeight(600-80);
        output.setFont(Font.font(24));
        output.setEditable(false);
        output.setFocusTraversable(false);

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
        GameImpl.createGame(input);
    }

    private void initCommands() {
        commands.put("exit", new Command("exit", "Exit the game", Platform::exit));
        commands.put("help", new Command("help", "Print all commands", this::runHelp));
        commands.put("go west", new Command("go west", "Move west", () -> runGo(-1 ,0)));
        commands.put("go east", new Command("go east", "Move east", () -> runGo(1 ,0)));
        commands.put("go north", new Command("go north", "Move north", () -> runGo(0 ,1)));
        commands.put("go south", new Command("go south", "Move south", () -> runGo(0 ,-1)));
        // North and south may need to be switched due to the y-axis being inverted in JavaFX

    }

    public static void println(String line) {
        output.appendText(line + "\n");
    }

    private void onInput(String line) {
        if (!commands.containsKey(line)) {
            println("Command " + line + " not found");
            return;
        }
        commands.get(line).execute();
    }

    private void runHelp() {
        commands.forEach((name, cmd) -> {
            println(name + "\t" + cmd.getDescription());
        });
    }

    private void runGo(int dx, int dy) {
        println("Moving by " + dx + " " + dy);
    }

    GameStage(){
        this.setScene(new Scene(createContent()));
        this.show();
    }
}
