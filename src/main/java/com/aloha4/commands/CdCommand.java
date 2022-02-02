package com.aloha4.commands;

import com.aloha4.AppContext;
import com.aloha4.enums.ItemType;
import com.aloha4.item.ContextItem;
import com.aloha4.item.Directory;

import java.util.Arrays;
import java.util.Objects;
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
        String[] dirs = directoryName.split("/");
        Directory currentDir = context.getCurrentDirectory();
        for (String dir : dirs) {
            if (dir.equals("..")) {
                currentDir = goBack(currentDir);
            } else {
                currentDir = goForward(dir, currentDir);
            }
        }
        context.setCurrentDirectory(currentDir);
    }

    private Directory goBack(Directory currentDir) {
        if(Objects.nonNull(currentDir.getParentDirectory())) {
            currentDir = currentDir.getParentDirectory();
        } else {
            System.out.println("Already in the root.");
        }
        return currentDir;
    }

    private Directory goForward(String directoryName, Directory currentDir) {
        Optional<ContextItem> toDirectory = currentDir.getItems().stream()
                .filter(contextItem -> contextItem.getItemType() == ItemType.DIRECTORY && contextItem.getPath().equalsIgnoreCase(directoryName)).findFirst();
        if(toDirectory.isPresent()) {
            currentDir = ((Directory) toDirectory.get());
        } else {
            System.out.println("Invalid directory name: " + directoryName);
        }
        return currentDir;
    }

}
