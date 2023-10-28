package Game.Player.PlayerSheet;

import Game.Player.PlayerSheet.Equipped.Equipped;
import Game.Player.PlayerSheet.PlayerConditions.PlayerConditions;
import Game.Player.PlayerSheet.PlayerStats.PlayerStats;

public interface PlayerSheet {

    PlayerStats getStats();

    PlayerConditions getConditions();

    Equipped getEquipped();
}