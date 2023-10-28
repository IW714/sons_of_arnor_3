package com.example.demo.Player;

import com.example.demo.Player.Inventory.Inventory;
import com.example.demo.Player.PlayerSheet.PlayerSheet;
public interface Player {

    Inventory getInventory();

    PlayerSheet getPS();

    String getName();

}