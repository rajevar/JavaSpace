package com.aloha4.commands;

import com.aloha4.AppContext;
import com.aloha4.item.Directory;

import java.util.*;

public class PwdCommand implements Command {
    @Override
    public void execute(AppContext context) {
        System.out.println("executing pwd command.");
        List<String> dirNames = new ArrayList<>();
        Directory dir = context.getCurrentDirectory();
        while(dir != null) {
            dirNames.add(dir.getPath());
            dir = dir.getParentDirectory();
        }
        Collections.reverse(dirNames);
        System.out.println(String.join("/", dirNames));
    }
}
