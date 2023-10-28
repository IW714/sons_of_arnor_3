package com.example.demo.Player.Inventory;

import com.example.demo.Player.Inventory.Item.Item;

import java.util.List;

public interface Inventory {

    List<Item> getItems();

    long getEncumbrance();

    void addItem(Item item);
}