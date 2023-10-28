package Game.Player;

import Game.Player.Inventory.Inventory;
import Game.Player.PlayerSheet.PlayerSheet;
public interface Player {

    Inventory getInventory();

    PlayerSheet getPS();

    String getName();

}