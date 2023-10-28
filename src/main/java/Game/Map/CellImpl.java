package Game.Map;

public class CellImpl implements Cell {
    private EventImpl _events;

    public CellImpl(EventImpl events) {
        _events = events;
    }

    // Getters

    public EventImpl getEvents() {
        return _events;
    }

    // Create random event
}
