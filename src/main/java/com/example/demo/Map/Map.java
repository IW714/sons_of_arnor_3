package com.example.demo.Map;

import com.example.demo.Map.Cell.Cell;

public interface Map {

    Cell[][] createMap(int length);
    Cell getCell();
}