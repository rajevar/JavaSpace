package com.aloha4.commands;

import com.aloha4.item.Directory;

public class MkDirCommand extends AbstractCommand {

    @Override
    protected void validate() {
        String[] currentInput = getContext().getCurrentInput();
        if(currentInput.length < 2) {
            System.out.println("Insufficient command arguments.. $mkdir <dirName>");
            return;
        }
        System.out.println("Executing Dir command");
        String directoryName = currentInput[1];
        Directory directory = new Directory(directoryName);
        directory.setParentDirectory(context.getCurrentDirectory());
        context.getCurrentDirectory().addDirectory(directory);
    }

}
