package Game;

import Game.Manager.GameManager;
import Game.Map.Map;
import Game.Player.Player;

public interface Game {

    Map getMap();

    Player getPlayer();

    GameManager getGM();
}