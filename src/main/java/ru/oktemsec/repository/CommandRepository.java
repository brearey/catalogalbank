package ru.oktemsec.repository;

import ru.oktemsec.entity.Command;

import java.util.ArrayList;
import java.util.Objects;

public class CommandRepository {
    public static ArrayList<Command> commandArrayList = new ArrayList<>();

    static  {
        commandArrayList.add( new Command("get_catalog", 0, "Посмотреть каталог, например: [get_catalog]") );
        commandArrayList.add( new Command("get_category", 1, "Посмотреть содержимое категории по его ID, например: [get_category 1]") );
        commandArrayList.add( new Command("add_category", 1, "Добавить категорию в каталог, например: [add_category компьюетры]") );
        commandArrayList.add( new Command("delete_category", 1, "Удалить категорию из каталога по его ID, например: [delete_category 1]") );
    }

    public static Command getCommandByName(String commandName) {
        Command result = null;
        for (Command command : commandArrayList) {
            if (command.name.equalsIgnoreCase(commandName)) {
                result = command;
                break;
            }
        }
        return result;
    }
}

//get_catalog,
//get_category,
//add_category,
//delete_category,
//rename_category,
//add_position,
//delete_position,
//set_position_count
