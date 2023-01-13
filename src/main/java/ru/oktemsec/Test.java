package ru.oktemsec;

import ru.oktemsec.controller.Input;
import ru.oktemsec.entity.Command;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        Command cmd = Input.getCommandFromString(inputLine);


        System.out.println("command name: " + cmd.name);
        System.out.println("command args count: " + cmd.argsCount);
        System.out.println("command desc: " + cmd.desc);

//        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
//        pw.println("command name: " + cmd.name);
//        pw.println("command args count: " + cmd.argsCount);
//        pw.println("command desc: " + cmd.desc);

        scanner.close();

    }
}
