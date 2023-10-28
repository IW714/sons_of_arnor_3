package Game.Player.Inventory.Item.NonEquippable;

import Game.Player.Inventory.Item.ItemImpl;
import Game.Player.Inventory.Item.ItemType;

public class NonEquippableImpl extends ItemImpl {

    private final ItemType _type = ItemType.NONEQUIPPABLE;


    public NonEquippableImpl(long value, String name, String description) {
        super(value, name, description);
    }


    // Getters

    public ItemType getType() {
        return _type;
    }
}