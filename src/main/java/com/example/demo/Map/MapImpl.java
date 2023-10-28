package com.example.demo.Map;

public class MapImpl implements Map {
    private Cell _cell;

    public MapImpl(CellImpl cell) {
        _cell = (Cell) cell;
    }


    // Getters


    public Cell getCell() {
        return _cell;
    }

    public Cell[][] createMap(int length) {
        Cell[][] cellArr = new Cell[length][length];
        return cellArr;
    }
}