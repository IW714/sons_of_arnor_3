package com.example.demo.Map;

import com.example.demo.Map.Cell.Cell;
import com.example.demo.Map.Cell.CellImpl;

public class MapImpl {
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