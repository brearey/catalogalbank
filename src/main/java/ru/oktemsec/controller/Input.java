package ru.oktemsec.controller;

import ru.oktemsec.entity.Command;
import ru.oktemsec.repository.CommandRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    private static Command command;

    static {
        command = null;
    }

    public static Command getCommandFromString(String inputLine) {
        Command _command = null;
        ArrayList<String> _commandArgs = new ArrayList<>();

        String inputLineWithoutBeginEndSpaces = inputLine.trim();
        String[] commandsAndArgs = inputLineWithoutBeginEndSpaces.split(" ");

        if (commandsAndArgs.length == 0) {
            return null;
        } else if (commandsAndArgs.length == 1) {
            _command = CommandRepository.getCommandByName(commandsAndArgs[0]);
        } else {
            for (int i = 0; i < commandsAndArgs.length; i++) {
                if (i > 0) {
                    _commandArgs.add(commandsAndArgs[i]);
                }
            }
            //For debug
            System.out.println(Arrays.toString(commandsAndArgs));
        }

        if (checkCommand(_command, _commandArgs.size())) {
            command = _command;
        }
        return command;
    }



    private static boolean checkCommand(Command cmd, int argsCount) {
        if (cmd == null) {
            System.err.println("Нет такой команды");
            return false;
        }
        if (argsCount != cmd.argsCount) {
            System.err.println("Ошибка в количестве аргументов");
            return false;
        }
        return true;
    }
}
