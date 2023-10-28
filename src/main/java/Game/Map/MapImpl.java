package Game.Map;

public class MapImpl implements Map {
    private Events _events;

    public MapImpl(EventsImpl events) {
        _regions = regions;
        _events = events;
    }


    // Getters


    public Regions getRegions() {
        return _regions;
    }

    public Events getEvents() {
        return _events;
    }
}