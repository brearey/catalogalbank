package ru.oktemsec.entity;

import java.util.ArrayList;

public class Category {
    private int id;

    static int count;
    public ArrayList<Position> positions;

    static {
        count = 0;
    }

    Category() {
        count++;
    }

    public int getId() {
        return id;
    }

    public Category(ArrayList<Position> positions) {
        this.positions = positions;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }
}
