package Game.Map;

public class MapImpl implements Map {
    private Regions _regions;
    private Events _events;

    public MapImpl(RegionsImpl regions, EventsImpl events) {
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