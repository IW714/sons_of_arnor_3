package Game.Map.Event;

import java.util.Scanner;

public class EventImpl {
    EventType _eventType;

    public EventImpl(EventType eventType) {
        _eventType = eventType;
    }

    // Getters

    public EventType getEventType() {
        return _eventType;
    }

    // Other Methods

    private void runEvent() {
        Scanner myObj = new Scanner(System.in);
        if (_eventType.equals(EventType.NEWITEM)) {
            System.out.println("You arrive in a new area and you see a large chest. Do you want to open it?");
            if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {
                System.out.println("Inside of the chest is a diamond, do you want to take it?");
                if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {

                }

        }
    }

}
