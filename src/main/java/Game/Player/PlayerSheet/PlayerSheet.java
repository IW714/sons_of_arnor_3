package Game.Player.PlayerSheet;

import Game.Player.Inventory.Item.Equippable.EquippableImpl;
import java.util.List;

public interface PlayerSheet {

    List<EquippableImpl> getEquipped();
}