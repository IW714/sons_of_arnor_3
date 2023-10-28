package Game.Manager;

public class GameManagerImpl implements GameManager {
    private long _GPM;
    private PlayerActivity _PA;

    public GameManagerImpl(PlayerActivity PA) {
        _PA = PA;
    }


    // Getters


    public long getGPM() {
        return _GPM;
    }

    public PlayerActivity getPA() {
        return _PA;
    }

}