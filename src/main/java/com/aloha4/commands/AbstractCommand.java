package com.aloha4.commands;

public abstract class AbstractCommand implements Command {
    String params;
    public void preExe() {
        preStep();
        execute();
        postStep();
    }

    private void postStep() {
        System.out.println("--AbstractCommand--postStep");
    }

    private void preStep() {
        System.out.println("--AbstractCommand--preStep");
    }

    public void execute() {
        System.out.println("--AbstractCommand--");
    }
}
