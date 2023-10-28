package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class StartStage extends Stage {
    Button openOther = new Button("Start");
    Button quit = new Button("Quit");
    VBox menu = new VBox();
    StackPane root = new StackPane();
    StartStage(){
        menu.getChildren().add(openOther);
        menu.getChildren().add(quit);
        BackgroundFill BackgroundFill = new BackgroundFill(Color.BLACK, null, null);
        Background bg = new Background(BackgroundFill );
//        root.getChildren().add(openOther);
//        root.getChildren().add(quit);
        root.getChildren().add(menu);
        root.setBackground(bg);
        this.setScene(new Scene(root, 400, 400));
        this.show();

        openOther.setOnAction(t -> new GameStage());
        quit.setOnAction(t -> close());

    }
}
