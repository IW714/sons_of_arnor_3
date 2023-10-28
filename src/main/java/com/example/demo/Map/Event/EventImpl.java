package com.example.demo.Map.Event;

import com.example.demo.Player.Inventory.Inventory;
import com.example.demo.Player.Inventory.Item.Equippable.EquipType;
import com.example.demo.Player.Inventory.Item.Equippable.EquippableImpl;
import com.example.demo.Player.Inventory.Item.Item;
import com.example.demo.Player.Inventory.Item.NonEquippable.NonEquippableImpl;

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

    private void runEvent(Inventory inventory) {
        Scanner myObj = new Scanner(System.in);
        if (getEventType().equals(EventType.NEWITEM)) {
            System.out.println("You arrive in a new area and you see a large chest. Do you want to open it?");
            if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {
                System.out.println("Inside of the chest is a diamond, do you want to take it?");
                if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {
                    Item diamond = new NonEquippableImpl(400, "diamond", "A very large blue diamond.", 5);
                    inventory.addItem(diamond);
                }
            }
        }
        if (getEventType().equals(EventType.ENEMY)) {
            System.out.println("You arrive in a new area and you see a band of thieves attacking a woman. Do you want to try and save her?");
            if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {
                System.out.println("The thieves attack you and pound your face to a pulp. You manage to escape barely with your life.");
            }
            else {
                System.out.println("You walk past the thieves, not paying them any mind.");
            }
        }
        if (getEventType().equals(EventType.RANDOM)) {
            System.out.println("A old man walks up to you and asks you if you are willing to spare a few coins. Will you give him money?");
            if (myObj.nextLine().equals("Yes") || myObj.nextLine().equals("yes")) {
                System.out.println("The old man smiles and hands you a knife as a gift. The knife is one of the most beautiful you have ever seen.");
                Item knife = new EquippableImpl(EquipType.Weapon, 500, "Golden Knife", "A golden knife that an old man gave to you.", 15);
                inventory.addItem(knife);
            }
            else {
                System.out.print("You shake your head and the old man lunges at you with a knife, you run until you can barely breathe, but you escape.");
            }
        }
    }
}
