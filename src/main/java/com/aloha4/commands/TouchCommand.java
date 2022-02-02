package com.aloha4.commands;

import com.aloha4.item.Directory;
import com.aloha4.item.File;

public class TouchCommand extends AbstractCommand {
    @Override
    protected void validate() {
        String[] currentInput = getContext().getCurrentInput();
        if(currentInput.length < 2) {
            System.out.println("Insufficient command arguments.. $touch <FileName>");
            return;
        }
        System.out.println("Executing touch command");
        String fileName = currentInput[1];
        File file = new File(fileName);
        context.getCurrentDirectory().getItems().add(file);
    }
}
