package com.aloha4.commands;

import com.aloha4.AppContext;

public class DirCommand implements Command {

    @Override
    public void execute(AppContext context) {
        System.out.println("Execute DirCommand..");
    }
}
