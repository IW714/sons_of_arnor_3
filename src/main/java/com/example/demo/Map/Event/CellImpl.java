package com.example.demo.Map.Event;

import Game.Map.Event.EventImpl;
import java.util.Random;
import Game.Map.Event.EventType;

import static Game.Map.Event.EventType.*;

public class CellImpl implements Cell {
    private EventImpl _events;
    private boolean _visit;
    private int _randInt;

    public CellImpl(EventImpl events) {
        Random rn = new Random();
        _events = events;
        _visit = false;
        _randInt = rn.nextInt();
    }


    // Getters


    //Run event when cell is visited
    public EventImpl getEvents() {
        return _events;
    }

    public void onCell() {
        _visit = true;
    }

    public void leaveCell(){
        _visit = false;
    }

    public EventType chooseEvent() {
        if(_randInt < 0.34){
            return NEWITEM;
        }
        else if (_randInt < 0.67) {
            return RANDOM;
        }
        else {
            return ENEMY;
        }
    }
}
