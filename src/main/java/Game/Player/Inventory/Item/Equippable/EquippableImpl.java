package Game.Player.Inventory.Item.Equippable;

import Game.Player.Inventory.Item.Equippable.Modifier.*;
import Game.Player.Inventory.Item.ItemImpl;
import Game.Player.Inventory.Item.ItemType;

public class EquippableImpl extends ItemImpl {

    private final ItemType _itemType = ItemType.EQUIPPABLE;
    private final EquipType _equipType;
    private final Modifier _mod;

    public EquippableImpl(EquipType equipType, ModifierImpl mod, long value, String name, String description, int encumbrance) {
        super(value, name, description, encumbrance);
        _equipType = equipType;
        _mod = mod;
    }


    // Getters


    public ItemType getItemType() {
        return _itemType;
    }

    public EquipType getEquipType() {
        return _equipType;
    }

    public Modifier getMod() {
        return _mod;
    }
}