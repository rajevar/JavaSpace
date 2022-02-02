package com.aloha4.commands;

import com.aloha4.AppContext;
import com.aloha4.enums.ItemType;
import com.aloha4.item.ContextItem;
import com.aloha4.item.Directory;

import java.util.Optional;

public class CdCommand extends AbstractCommand {

    @Override
    protected void validate() {
        if(!isValid()) {
            System.out.println("Invalid cd command.. cd <dirname> or the directory does not exist");
            return;
        }
        System.out.println("Executing cd command");
        String[] currentInput = getContext().getCurrentInput();
        String directoryName = currentInput[1];
        if(directoryName.equals("..")) {
            goBack(context);
        } else {
            goForward(context,directoryName);
        }

    }

    private void goBack(AppContext context) {
        if(context.getCurrentDirectory().getParentDirectory() != null) {
            context.setCurrentDirectory(context.getCurrentDirectory().getParentDirectory());
        } else {
            System.out.println("Already in the root.");
        }
    }

    private void goForward(AppContext context, String directoryName) {
        Optional<ContextItem> toDirectory = context.getCurrentDirectory().getItems().stream()
                .filter(contextItem -> contextItem.getItemType() == ItemType.DIRECTORY && contextItem.getPath().equalsIgnoreCase(directoryName)).findFirst();
        if(toDirectory.isPresent()) {
            context.setCurrentDirectory((Directory) toDirectory.get());
        } else {
            System.out.println("Invalid directory name: " + directoryName);
        }
    }

}
