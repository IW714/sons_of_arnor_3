package com.example.demo.Player;

import com.example.demo.Player.Inventory.*;
import com.example.demo.Player.PlayerSheet.*;

public class PlayerImpl implements Player {
    private Inventory _inventory;
    private PlayerSheet _PS;
    private String _name;

    public PlayerImpl(Inventory inventory, PlayerSheet PS, String name) {
        _inventory = inventory;
        _PS = PS;
        _name = name;
    }


    // Getters

    public Inventory getInventory() {
        return _inventory;
    }

    public PlayerSheet getPS() {
        return _PS;
    }

    public String getName() {
        return _name;
    }
}