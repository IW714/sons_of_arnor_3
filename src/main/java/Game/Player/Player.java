package Game.Player;

import Game.Player.Inventory.Inventory;
import Game.Player.PlayerSheet.PlayerSheet;
import Game.Player.RelationshipSheet.RelationSheet;
public interface Player {

    Inventory getInventory();

    RelationSheet getRS();

    PlayerSheet getPS();

}