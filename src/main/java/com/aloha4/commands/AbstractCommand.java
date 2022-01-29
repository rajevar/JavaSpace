package com.aloha4.commands;

import com.aloha4.AppContext;

public abstract class AbstractCommand implements Command {
    String params = null;

    @Override
    public void execute(AppContext context) {
        run();
    }

    public abstract void run();
    public String getParams() {
        return params;
    }

    @Override
    public void setParams(String params) {
        this.params = params;
    }
}
