package Game.Player;

import Game.GameImpl;
import Game.Player.Inventory.*;
import Game.Player.PlayerSheet.*;

import java.security.cert.CRLSelector;

public class PlayerImpl implements Player {
    private Inventory _inventory;
    private PlayerSheet _PS;

    public PlayerImpl(InventoryImpl inventory, PlayerSheetImpl PS) {
        _inventory = inventory;
        _PS = PS;
    }


    // Getters

    public Inventory getInventory() {
        return _inventory;
    }


    public PlayerSheet getPS() {
        return _PS;
    }
}