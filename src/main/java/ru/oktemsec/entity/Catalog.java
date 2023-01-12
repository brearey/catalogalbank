package ru.oktemsec.entity;

import java.util.ArrayList;

public class Catalog {
    static int count;
    public ArrayList<Category> categories;

    static {
        count = 0;
    }

    Catalog() {
        count++;
        categories = new ArrayList<>();
    }
}
