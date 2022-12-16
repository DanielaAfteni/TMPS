package com.company.lab4;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    public void realizeazaInstructaj(Command command) {
        command.executareaInstructajlui();
        commands.add(command);
    }
    private List<Command> commands;

    public CommandInvoker() {
        commands = new ArrayList<>();
    }
}
