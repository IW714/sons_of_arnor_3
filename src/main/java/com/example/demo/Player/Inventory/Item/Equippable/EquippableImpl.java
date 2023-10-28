package com.example.demo.Player.Inventory.Item.Equippable;

import com.example.demo.Player.Inventory.Item.ItemImpl;
import com.example.demo.Player.Inventory.Item.ItemType;

public class EquippableImpl extends ItemImpl {

    private final ItemType _itemType = ItemType.EQUIPPABLE;
    private final EquipType _equipType;

    public EquippableImpl(EquipType equipType, long value, String name, String description, int encumbrance) {
        super(value, name, description, encumbrance);
        _equipType = equipType;
    }


    // Getters


    public ItemType getItemType() {
        return _itemType;
    }

    public EquipType getEquipType() {
        return _equipType;
    }

}