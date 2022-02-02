package com.aloha4.item;

import com.aloha4.enums.ItemType;

public abstract class ContextItem {
    private ItemType itemType;
    private String path;

    ContextItem(ItemType itemType, String path) {
        this.itemType = itemType;
        this.path = path;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
