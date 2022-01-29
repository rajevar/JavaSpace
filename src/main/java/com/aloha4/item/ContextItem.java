package com.aloha4.item;

import com.aloha4.enums.ItemType;

public abstract class ContextItem {
    private ItemType itemType;
    private String path;

    ContextItem(ItemType itemType, String path) {
        this.itemType = itemType;
        this.path = path;
    }
}
