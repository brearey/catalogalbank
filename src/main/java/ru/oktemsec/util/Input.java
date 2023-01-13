package ru.oktemsec.util;

import ru.oktemsec.entity.Category;
import ru.oktemsec.entity.Command;
import ru.oktemsec.entity.Position;

public class Input {
    private Command command;

    public Input(Command command) {
        if (checkCommand(command.name, command.args.length)) {
            this.command = command;
        }
    }

    public Command getCommand() {
        return command;
    }

    private boolean checkCommand(String name, int argsCount) {
        if (!name.equals(this.command.name)) {
            System.err.println("Нет такой команды");
            return false;
        }
        if (argsCount != this.command.args.length) {
            System.err.println("Ошибка в количестве аргументов");
            return false;
        }
        return true;
    }
}
