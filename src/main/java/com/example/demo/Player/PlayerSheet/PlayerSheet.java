package com.example.demo.Player.PlayerSheet;

import com.example.demo.Player.Inventory.Item.Equippable.EquippableImpl;
import java.util.List;

public interface PlayerSheet {

    List<EquippableImpl> getEquipped();

    int getHealth();

    int getStrength();

    int getMana();
}