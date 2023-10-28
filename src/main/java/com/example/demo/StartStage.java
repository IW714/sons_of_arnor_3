package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StartStage extends Stage {
    Button openOther = new Button("Open other Stage");
    HBox x = new HBox();
    StartStage(){
        x.getChildren().add(openOther);
        this.setScene(new Scene(x, 300, 300));
        this.show();

        openOther.setOnAction(t -> new GameStage());
    }
}
