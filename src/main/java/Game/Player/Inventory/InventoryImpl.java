package Game.Player.Inventory;

import Game.Player.Inventory.Item.Item;

import java.util.List;


public class InventoryImpl implements Inventory {
    private List<Item> _items;
    private long _encumbrance;

    public InventoryImpl(List<Item> items, long encumbrance) {
        _items = items;
        _encumbrance = encumbrance;
    }


    // Getters

    public List<Item> getItems() {
        return _items;
    }

    public long getEncumbrance() {
        return _encumbrance;
    }


    // Setters


    public void setEncumbrance(long encumbrance) {
        _encumbrance = encumbrance;
    }

    // Other Methods

    public void addItem(Item item) {
        getItems().add(item);
    }
}