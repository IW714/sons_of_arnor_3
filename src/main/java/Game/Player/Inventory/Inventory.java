package Game.Player.Inventory;

import Game.Player.Inventory.Item.Item;

public interface Inventory {

    Item[] getItems();

    long getEncumbrance();
}