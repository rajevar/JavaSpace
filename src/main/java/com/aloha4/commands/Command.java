package com.aloha4.commands;

import com.aloha4.AppContext;

public interface Command {
    void execute(AppContext context);
    void setParams(String params);
}
