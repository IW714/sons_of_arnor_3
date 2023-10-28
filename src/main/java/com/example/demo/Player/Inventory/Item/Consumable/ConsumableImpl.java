package com.example.demo.Player.Inventory.Item.Consumable;

import com.example.demo.Player.Inventory.Item.Consumable.Effect.Effect;
import com.example.demo.Player.Inventory.Item.Consumable.Effect.EffectImpl;
import com.example.demo.Player.Inventory.Item.ItemImpl;
import com.example.demo.Player.Inventory.Item.ItemType;

public class ConsumableImpl extends ItemImpl {

    private final ItemType _type = ItemType.CONSUMABLE;
    private final Effect _effect;


    public ConsumableImpl(EffectImpl effect, long value, String name, String description, int encumbrance) {
        super(value, name, description, encumbrance);
        _effect = effect;
    }


    // Getters

    public ItemType getType() {
        return _type;
    }

    public Effect getEffect() {
        return _effect;
    }
}