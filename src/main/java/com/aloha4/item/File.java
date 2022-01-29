package com.aloha4.item;

import com.aloha4.enums.ItemType;

public class File extends ContextItem {

    File(String path) {
        super(ItemType.FILE, path);
    }
}
