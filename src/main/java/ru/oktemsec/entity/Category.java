package ru.oktemsec.entity;

import java.util.ArrayList;

public class Category {
    static int count;

    private int id;
    private String name;
    private final ArrayList<Position> positions;

    static {
        count = 0;
    }

    public Category(String name) {
        this.name = name;
        count++;
        id = count;
        positions = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }
}
