package com.aloha4.item;

import com.aloha4.enums.ItemType;

public class Directory extends ContextItem {

    Directory(String path) {
        super(ItemType.DIRECTORY, path);
    }
}
