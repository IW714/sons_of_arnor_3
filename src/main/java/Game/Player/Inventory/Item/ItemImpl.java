package Game.Player.Inventory.Item;

public abstract class ItemImpl implements Item {
    private long _value;
    private String _name;
    private String _description;
    private int _encumbrance;

    public ItemImpl(long value, String name, String description, int encumbrance) {
        _value = value;
        _name = name;
        _description = description;
        _encumbrance = encumbrance;
    }


    // Getters


    public long getValue() {
        return _value;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public int getEncumbrance() {
        return _encumbrance;
    }
}