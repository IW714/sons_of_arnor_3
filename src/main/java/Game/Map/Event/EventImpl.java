package Game.Map.Event;

public class EventImpl {
    EventType _eventType;

    public EventImpl(EventType eventType) {
        _eventType = eventType;
    }

    // Getters

    public EventType getEventType() {
        return _eventType;
    }



}
