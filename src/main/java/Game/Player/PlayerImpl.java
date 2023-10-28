package Game.Player;

import Game.GameImpl;
import Game.Player.Inventory.*;
import Game.Player.PlayerSheet.*;
import Game.Player.RelationshipSheet.*;

import java.security.cert.CRLSelector;

public class PlayerImpl implements Player {
    private Inventory _inventory;
    private RelationSheet _RS;
    private PlayerSheet _PS;

    public PlayerImpl(InventoryImpl inventory, RelationSheetImpl RS, PlayerSheetImpl PS) {
        _inventory = inventory;
        _RS = RS;
        _PS = PS;
    }


    // Getters

    public Inventory getInventory() {
        return _inventory;
    }

    public RelationSheet getRS() {
        return _RS;
    }

    public PlayerSheet getPS() {
        return _PS;
    }
}