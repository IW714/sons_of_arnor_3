package Game.Player.PlayerSheet;

import Game.Player.PlayerImpl;

public class PlayerSheetImpl implements PlayerSheet {
    private PlayerStats _stats;
    private PlayerConditions _conditions;
    private Equipped _equipped;

    public PlayerSheetImpl(PlayerStatsImpl stats, PlayerConditionsImpl conditions, EquippedImpl equipped) {
        _stats = stats;
        _conditions = conditions;
        _equipped = equipped;
    }


    // Getters


    public PlayerStats getStats() {
        return _stats;
    }

    public PlayerConditions getConditions() {
        return _conditions;
    }

    public Equipped getEquipped() {
        return _equipped;
    }
}