package com.example.demo;


import com.example.demo.GUI.GameStage;
import com.example.demo.Map.*;
import com.example.demo.Player.*;
import com.example.demo.Player.Inventory.Inventory;
import com.example.demo.Player.Inventory.InventoryImpl;
import com.example.demo.Player.PlayerSheet.PlayerSheet;
import com.example.demo.Player.PlayerSheet.PlayerSheetImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Scanner;

public class GameImpl implements Game {
    private Map _map;
    private Player _player;
    private static String name;
    private static int strength;
    private static int health;
    private static int mana;

    public GameImpl(Map map, Player player) {
        _map = map;
        _player = player;
    }

    public GameImpl(Player player) {
        _player = player;
    }


    // Getters


    public Map getMap() {
        return _map;
    }

    public Player getPlayer() {
        return _player;
    }

    // Other Methods
    public static Game createGame(TextField input) {
        GameStage.println("Welcome to Sons of Arnor, a choose your own adventure game. What is your name?");

        input.setOnAction(e -> {
            String name = input.getText();
            if (!name.isEmpty()) {
                input.clear();
                GameStage.println("Hello " + name + "! In Sons of Arnor, each player will have 3 different stats: Strength, Health, and Mana.");
                GameStage.println("How much Strength would you like: 1-10");

                input.setOnAction(strengthEvent -> {
                    String strengthText = input.getText();
                    try {
                        int strength = Integer.parseInt(strengthText);
                        if (strength >= 1 && strength <= 10) {
                            input.clear();
                            GameStage.println("Your strength has been updated to: " + strength);
                            // Now ask for health
                            GameStage.println("How much Health would you like: 1-10");

                            input.setOnAction(healthEvent -> {
                                String healthText = input.getText();
                                try {
                                    int health = Integer.parseInt(healthText);
                                    if (health >= 1 && health <= 10) {
                                        input.clear();
                                        GameStage.println("Your health has been updated to: " + health);
                                        // Now ask for mana
                                        GameStage.println("How much Mana would you like: 1-10");

                                        input.setOnAction(manaEvent -> {
                                            String manaText = input.getText();
                                            try {
                                                int mana = Integer.parseInt(manaText);
                                                if (mana >= 1 && mana <= 10) {
                                                    input.clear();
                                                    GameStage.println("Your mana has been updated to: " + mana);
                                                    // Create the player and game
                                                    PlayerSheet playerSheet = new PlayerSheetImpl(strength, health, mana, new ArrayList<>());
                                                    Inventory inventory = new InventoryImpl(new ArrayList<>(), 0);
                                                    Player player = new PlayerImpl(inventory, playerSheet, name);
                                                    Game game = new GameImpl(player);
                                                    // You may want to do something with the 'game' object here
                                                } else {
                                                    GameStage.println("Mana must be between 1 and 10.");
                                                }
                                            } catch (NumberFormatException ex) {
                                                GameStage.println("Invalid input. Please enter a number between 1 and 10 for mana.");
                                            }
                                        });
                                    } else {
                                        GameStage.println("Health must be between 1 and 10.");
                                    }
                                } catch (NumberFormatException ex) {
                                    GameStage.println("Invalid input. Please enter a number between 1 and 10 for health.");
                                }
                            });
                        } else {
                            GameStage.println("Strength must be between 1 and 10.");
                        }
                    } catch (NumberFormatException ex) {
                        GameStage.println("Invalid input. Please enter a number between 1 and 10 for strength.");
                    }
                });
            } else {
                GameStage.println("Please enter a valid name.");
            }
        });
        return null;
    }

}