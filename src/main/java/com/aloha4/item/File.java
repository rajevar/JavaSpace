package com.aloha4.item;

import com.aloha4.enums.ItemType;

public class File extends ContextItem {
    Directory directoryName;

    public File(String path) {
        super(ItemType.FILE, path);
    }

    public Directory getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(Directory directoryName) {
        this.directoryName = directoryName;
    }
}
