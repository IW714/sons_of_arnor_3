package com.example.demo;

import Game.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static Game.GameImpl.createGame;

public class GameStage extends Stage {
    Label x = new Label("Second Stage");
    VBox y = new VBox();

    GameStage(){
        y.getChildren().add(x);
        this.setScene(new Scene(y, 600, 400));
        this.show();
        Game game = createGame();

    }
}
