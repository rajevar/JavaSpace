package com.aloha4.item;

import com.aloha4.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public class Directory extends ContextItem {
    private Directory parentDirectory;
    private List<ContextItem> items = new ArrayList<>();

    public Directory(String path) {
        super(ItemType.DIRECTORY, path);
    }

    public void addDirectory(Directory directory) {
        items.add(directory);
    }

    public Directory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public List<ContextItem> getItems() {
        return items;
    }

    public void setItems(List<ContextItem> items) {
        this.items = items;
    }

}
