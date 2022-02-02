package com.aloha4.commands;

import com.aloha4.AppContext;

public abstract class AbstractCommand implements Command {
    AppContext context;
    protected abstract void validate();

    @Override
    public void execute(AppContext context) {
        setContext(context);
        validate();
    }

    private void setContext(AppContext context) {
        this.context = context;
    }

    public AppContext getContext() {
        return context;
    }

    public boolean isValid() {
        String[] currentInput = getContext().getCurrentInput();
        return currentInput.length >= 2 && context.getCurrentDirectory().getItems() != null;
    }
}
