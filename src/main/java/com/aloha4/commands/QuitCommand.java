package com.aloha4.commands;

public class QuitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing Quit command");
        System.exit(1);
    }
}
