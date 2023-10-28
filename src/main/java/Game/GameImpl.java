package Game;

import Game.Manager.*;
import Game.Map.*;
import Game.Player.*;
import Game.Player.Inventory.Inventory;
import Game.Player.Inventory.InventoryImpl;
import Game.Player.Inventory.Item.Equippable.EquippableImpl;
import Game.Player.Inventory.Item.Item;
import Game.Player.PlayerSheet.PlayerSheet;
import Game.Player.PlayerSheet.PlayerSheetImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class GameImpl implements Game {
    private Map _map;
    private Player _player;
    private GameManager _GM;

    public GameImpl(Map map, Player player, GameManager GM) {
        _map = map;
        _player = player;
        _GM = GM;
    }

    public GameImpl(Map map, Player player) {
        _map = map;
        _player = player;
    }

    public GameImpl(Player player) {
        _player = player;
    }


    // Getters


    public Map getMap() {
        return _map;
    }

    public Player getPlayer() {
        return _player;
    }

    public GameManager getGM() {
        return _GM;
    }

    // Other Methods

    public static Game createGame() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Sons of Arnor, a choose your own adventure game. What is your name?");
        String name = myObj.nextLine();
        System.out.println("Hello " + name + "! In Sons of Arnor, each player will have 3 different stats: Strength, Health, " +
                "and Mana.");
        System.out.println("How much Strength would you like: 1-10");
        int strength = myObj.nextInt();
        System.out.println("How much Health would you like: 1-10");
        int health = myObj.nextInt();
        System.out.println("How much Mana would you like: 1-10");
        int mana = myObj.nextInt();

        PlayerSheet playerSheet = new PlayerSheetImpl(strength, health, mana, new ArrayList<>());
        Inventory inventory = new InventoryImpl(new ArrayList<>(), 0);
        Player player = new PlayerImpl(inventory, playerSheet, name);
        return new GameImpl(player);
    }
}