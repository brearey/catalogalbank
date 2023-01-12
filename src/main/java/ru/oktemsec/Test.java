package ru.oktemsec;

import ru.oktemsec.entity.Category;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String inputLineWithoutBeginEndSpaces = inputLine.trim();
        String[] commands = inputLineWithoutBeginEndSpaces.split(" ");

        if (commands.length > 2) {
            System.out.println("Некорректная команда");
            return;
        }

        for (String command : commands) {
            command = command.trim();
            System.out.println(command);
        }

        scanner.close();

    }
}
