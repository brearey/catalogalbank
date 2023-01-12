package ru.oktemsec;

import ru.oktemsec.entity.Catalog;
import ru.oktemsec.entity.Category;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean gameover = false;

        // create one catalog
        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);

        while(!gameover) {
            println("");
            println("=========================");
            println("Главное меню:");
            println("1 get catalog");
            println("2 add category to catalog");

            int command = scanner.nextInt();

            switch (command) {
                case 1 -> {

                    println("Количество каталогов: " + Catalog.count);
                    println("Категории в каталоге: ");
                    println("- Количество категорий в каталоге: " + catalog.getCategories().size());

                    if (catalog.getCategories().size() > 0) {
                        println("Список категорий: (id, name, count of positions)");
                        catalog.getCategories().forEach(
                                (category) -> {
                                    printCategoryOnLine(category);
                                }
                        );

                    }

                    //gameover = true;
                }
                case 2 -> {

                    Category computersCategory = new Category("компьютеры");
                    catalog.addCategory(computersCategory);

                    //gameover = true;
                }
                default -> {
                    println("Incorrect command");
                    //gameover = true;
                }
            }
        }
    }

    private static void printCategoryOnLine(Category category) {
        print(String.valueOf(category.getId()));
        print(" " + category.getName());
        print(" " + String.valueOf(category.getPositions().size()) + "\n");
    }

    private static void print(String message) {
        System.out.print(message);
    }
    private static void println(String message) {
        System.out.println(message);
    }
}