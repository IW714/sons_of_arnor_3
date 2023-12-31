package com.example.demo.GUI;

import javafx.scene.paint.Color;

public class Command {

    private String name;
    private String description;
    private Runnable action;

    public Command(String name, String description, Runnable action) {
        this.name = name;
        this.description = description;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void execute() {
        action.run();
    }
}
