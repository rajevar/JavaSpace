package com.aloha4.enums;

import com.aloha4.commands.Command;
import com.aloha4.commands.DirCommand;
import com.aloha4.commands.HelpCommand;
import com.aloha4.commands.QuitCommand;

import java.util.Arrays;

public enum CommandType{
    HELP("help", new HelpCommand()),
    DIR("dir", new DirCommand()),
    LS("ls", new DirCommand()),
    QUIT("quit", new QuitCommand());

    private final String commandName;
    private final Command command;

    public String getCommandName() {
        return commandName;
    }

    public Command getCommand() {
        return command;
    }

    CommandType(String commandName, Command command) {
        this.commandName = commandName;
        this.command = command;
    }

    public static CommandType getCommandTypeFor(String input) {
        return Arrays.stream(CommandType.values())
                .filter(commandName -> commandName.getCommandName().toLowerCase().equals(input))
                .findFirst().orElse(null);
    }

}
