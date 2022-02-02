package com.aloha4;

import com.aloha4.item.Directory;

public class AppContext {
    private String currentInput[] = null;
    private Directory currentDirectory;

    public String[] getCurrentInput() {
        return currentInput;
    }

    public void setCurrentInput(String[] currentInput) {
        this.currentInput = currentInput;
    }

    public Directory getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(Directory currentDirectory) {
        this.currentDirectory = currentDirectory;
    }
}
