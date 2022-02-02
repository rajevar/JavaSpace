package com.aloha4.commands;

import com.aloha4.enums.ItemType;
import com.aloha4.item.ContextItem;

import java.util.List;

public class LsCommand extends AbstractCommand {

    @Override
    protected void validate() {
        System.out.println("Executing LsCommand.. it may or may not have params.");
        List<ContextItem> items = context.getCurrentDirectory().getItems();
        runLsCommandFor(items);
    }

    private void runLsCommandFor(List<ContextItem> items) {
        if(items.isEmpty()) {
            System.out.println(context.getCurrentDirectory().getPath() + " is empty..");
            return;
        }
        items.forEach(contextItem -> {
            String output = contextItem.getItemType() == ItemType.FILE ? " -- File: " + contextItem.getPath() : " -- Dir: " + contextItem.getPath();
            System.out.println(output);
        });
    }
}
