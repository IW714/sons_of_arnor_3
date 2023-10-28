package com.example.demo.Player.PlayerSheet;

import com.example.demo.Player.Inventory.Item.Equippable.EquippableImpl;
import java.util.List;

public class PlayerSheetImpl implements PlayerSheet {
    private int _strength;
    private int _health;
    private int _mana;
    private List<EquippableImpl> _equipped;

    public PlayerSheetImpl(int strength, int health, int mana, List<EquippableImpl> equipped) {
        _strength = strength;
        _health = health;
        _mana = mana;
        _equipped = equipped;
    }


    // Getters


    public int getStrength() {
        return _strength;
    }

    public int getHealth() {
        return _health;
    }

    public int getMana() {
        return _mana;
    }

    public List<EquippableImpl> getEquipped() {
        return _equipped;
    }
}