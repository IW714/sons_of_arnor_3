package Game;

import Game.Manager.*;
import Game.Map.*;
import Game.Player.*;

public class GameImpl implements Game {
    private Map _map;
    private Player _player;
    private GameManager _GM;

    public GameImpl(MapImpl map, PlayerImpl player, GameManagerImpl GM) {
        _map = map;
        _player = player;
        _GM = GM;
    }


    // Getters


    public Map getMap() {
        return _map;
    }

    public Player getPlayer() {
        return _player;
    }

    public GameManager getGM() {
        return _GM;
    }

    // Other Methods

}