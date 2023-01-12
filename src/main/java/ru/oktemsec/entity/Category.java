package ru.oktemsec.entity;

import java.util.ArrayList;

public class Category {
    private static int count;

    private int _id;
    public ArrayList<Position> positions;

    static {
        count = 0;
    }

    Category() {
        count++;
        _id = count;
    }

    public int getId() {
        return _id;
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

    public void deletePosition(int positionId) {
        positions.remove(positionId);
    }
}
