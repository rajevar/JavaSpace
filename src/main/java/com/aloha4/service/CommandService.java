package com.aloha4.service;

import com.aloha4.AppContext;
import com.aloha4.commands.Command;
import com.aloha4.enums.CommandType;

import java.util.Objects;

public class CommandService {

    CommandFactory factory = CommandFactory.getInstance();

    public void run(String inputString, AppContext context) {
        String[] s = inputString.split(" ");
        CommandType commandType = CommandType.getCommandTypeFor(s[0]);
        if(Objects.isNull(commandType)) {
            System.out.println("Bad command: " + inputString);
            return;
        }
        Command command = factory.getCommand(commandType);
        context.setCurrentInput(s);
        command.execute(context);
        //command.setParam()
    }
}
