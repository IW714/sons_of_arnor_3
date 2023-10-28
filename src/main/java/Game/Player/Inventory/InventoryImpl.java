package Game.Player.Inventory;

import Game.Player.Inventory.Item.Item;
import Game.Player.Inventory.Item.ItemImpl;


public class InventoryImpl implements Inventory {
    private Item[] _items;
    private long _encumbrance;

    public InventoryImpl(ItemImpl[] items, long encumbrance) {
        _items = items;
        _encumbrance = encumbrance;
    }


    // Getters

    public Item[] getItems() {
        return _items;
    }

    public long getEncumbrance() {
        return _encumbrance;
    }


    // Setters


    public void setEncumbrance(long encumbrance) {
        _encumbrance = encumbrance;
    }
}