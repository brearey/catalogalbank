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
            println("1 get catalog");
            println("2 add category to catalog");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {

                    println( "Количество каталогов: " + Catalog.count );
                    println( "Категории в каталоге: " + catalog.getCategories().toString() );

                    //gameover = true;
                    break;
                }
                case 2: {

                    Category computersCategory = new Category("компьютеры");
                    catalog.addCategory(computersCategory);
                    println( "Категории в каталоге: " + catalog.getCategories().toString() );

                    //gameover = true;
                    break;
                }
                default: {
                    println("Incorrect command");
                    //gameover = true;
                    break;
                }
            }
        }
    }

    private static void print(String message) {
        System.out.print(message);
    }
    private static void println(String message) {
        System.out.println(message);
    }
}