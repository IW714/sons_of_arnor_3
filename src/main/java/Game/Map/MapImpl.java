package Game.Map;

public class MapImpl implements Map {
    private Cell _cell;

    public MapImpl(Cell cell) {
        _cell = cell;
    }


    // Getters


    public Cell getCell() {
        return _cell;
    }

}