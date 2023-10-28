package com.example.demo;


import com.example.demo.GUI.GameStage;
import com.example.demo.Map.*;
import com.example.demo.Player.*;
import com.example.demo.Player.Inventory.Inventory;
import com.example.demo.Player.Inventory.InventoryImpl;
import com.example.demo.Player.PlayerSheet.PlayerSheet;
import com.example.demo.Player.PlayerSheet.PlayerSheetImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class GameImpl implements Game {
    private Map _map;
    private Player _player;

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
    public static Game createGame() {
        Scanner myObj = new Scanner(System.in);
//        GameStage.
        System.out.println("Welcome to Sons of Arnor, a choose your own adventure game. What is your name?");
        String name = myObj.nextLine();
        System.out.println("Hello " + name + "! In Sons of Arnor, each player will have 3 different stats: Strength, Health, " +
                "and Mana.");
        int strength = 0;
        int health = 0;
        int mana = 0;
        boolean valid = true;
        int totalAttributes = 0;
        System.out.println("How much Strength would you like: 1-10(You may have 15 attributes split between the stats)");
        while(valid) {
            strength = myObj.nextInt();
            if(strength < 1 || strength > 10) {
                System.out.println("Strength must be between 1-10");
            }
            else {
                valid = false;
            }
        }
        valid = true;
        totalAttributes += strength;

        System.out.println("How much Health would you like: 1-10(You may have 15 attributes split between the stats)");
        while(valid) {
            health = myObj.nextInt();
            if(health < 1 || health > 10) {
                System.out.println("Health must be between 1-10");
            }
            else if (totalAttributes + health > 14) {
                System.out.println("Too many attributes have been selected, pick a lower number");
            }
            else {
                valid = false;
            }
        }
        valid = true;
        totalAttributes += health;


        mana = 15 - totalAttributes;
        System.out.println("Your remaining points will be spent on mana. You have " + mana + "mana.");

        PlayerSheet playerSheet = new PlayerSheetImpl(strength, health, mana, new ArrayList<>());
        Inventory inventory = new InventoryImpl(new ArrayList<>(), 0);
        Player player = new PlayerImpl(inventory, playerSheet, name);
        return new GameImpl(player);
    }


}