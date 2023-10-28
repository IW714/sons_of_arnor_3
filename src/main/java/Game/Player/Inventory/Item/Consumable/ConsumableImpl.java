package Game.Player.Inventory.Item.Consumable;

import Game.Player.Inventory.Item.Consumable.Effect.Effect;
import Game.Player.Inventory.Item.Consumable.Effect.EffectImpl;
import Game.Player.Inventory.Item.ItemImpl;
import Game.Player.Inventory.Item.ItemType;

public class ConsumableImpl extends ItemImpl {

    private final ItemType _type = ItemType.CONSUMABLE;
    private final Effect _effect;


    public ConsumableImpl(EffectImpl effect, long value, String name, String description) {
        super(value, name, description);
        _effect = effect;
    }


    // Getters

    public ItemType getType() {
        return _type;
    }

    public Effect getEffect() {
        return _effect;
    }
}