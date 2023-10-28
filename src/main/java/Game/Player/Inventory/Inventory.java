package Game.Player.Inventory;

import Game.Player.Inventory.Item.Item;

import java.util.List;

public interface Inventory {

    List<Item> getItems();

    long getEncumbrance();
}