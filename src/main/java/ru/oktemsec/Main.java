package ru.oktemsec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean gameover = false;

        Scanner scanner = new Scanner(System.in);
        while(!gameover) {
            println("1 Say hello");
            println("2 Say bye");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    println("Hello my friend!");
                    gameover = true;
                    break;
                }
                case 2: {
                    println("Oo bye bye");
                    gameover = true;
                    break;
                }
                default: {
                    println("Incorrect command");
                    gameover = true;
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