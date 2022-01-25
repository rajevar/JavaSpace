package com.aloha4.service;

import com.aloha4.commands.Command;
import com.aloha4.enums.CommandType;

import java.util.Objects;

public class CommandService {

    CommandFactory factory = CommandFactory.getInstance();

    public void run(String inputString) {
        CommandType commandType = CommandType.getCommandTypeFor(inputString);
        if(Objects.isNull(commandType)) {
            System.out.println("Bad input..");
            return;
        }
        Command command = factory.getCommand(commandType);
        command.execute();
    }
}
