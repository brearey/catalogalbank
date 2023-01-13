package ru.oktemsec.entity;

import ru.oktemsec.repository.CommandName;

public class Command {
    public String name;
    public int argsCount;
    public String desc;

    public Command(String name, int argsCount, String desc) {
        this.name = name;
        this.argsCount = argsCount;
        this.desc = desc;
    }
}
