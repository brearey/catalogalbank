package ru.oktemsec.entity;

import java.util.ArrayList;

public class Catalog {
    public static int count;
    public ArrayList<Category> categories;

    static {
        count = 0;
    }

    public Catalog() {
        count++;
        categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void deleteCategory(int categoryId) {
        categories.remove(categoryId);
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }
}
