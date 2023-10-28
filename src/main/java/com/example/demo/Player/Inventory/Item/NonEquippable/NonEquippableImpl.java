package com.example.demo.Player.Inventory.Item.NonEquippable;

import com.example.demo.Player.Inventory.Item.ItemImpl;
import com.example.demo.Player.Inventory.Item.ItemType;

public class NonEquippableImpl extends ItemImpl {

    private final ItemType _type = ItemType.NONEQUIPPABLE;


    public NonEquippableImpl(long value, String name, String description, int encumbrance) {
        super(value, name, description, encumbrance);
    }


    // Getters

    public ItemType getType() {
        return _type;
    }
}
