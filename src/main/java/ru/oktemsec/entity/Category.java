package ru.oktemsec.entity;

import java.util.ArrayList;

public class Category {
    private static int count;

    private int id;
    private String name;
    private ArrayList<Position> positions;

    static {
        count = 0;
    }

    Category() {
        count++;
        id = count;
        positions = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
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
}
