package Game.Player.PlayerSheet;

import Game.Player.Inventory.Item.Equippable.EquippableImpl;
import Game.Player.PlayerImpl;

import java.util.List;

public class PlayerSheetImpl implements PlayerSheet {
    private int _mana;
    private int _strength;
    private int _health;
    private List<EquippableImpl> _equipped;

    public PlayerSheetImpl(List<EquippableImpl> equipped, int health, int strength, int mana) {
        _health = health;
        _strength = strength;
        _mana = mana;
        _equipped = equipped;
    }


    // Getters


    public int getHealth() {
        return _health;
    }

    public int getStrength() {
        return _strength;
    }

    public int getMana() {
        return _mana;
    }

    public List<EquippableImpl> getEquipped() {
        return _equipped;
    }

    // Setters

    public void changeHealth(int health) {
        _health += health;
    }

    public void changeStrength(int strength) {
        _strength += strength;
    }

    public void changeMana(int mana) {
        _mana += mana;
    }

    public void addEquippable(EquippableImpl equippable) {
    }
}