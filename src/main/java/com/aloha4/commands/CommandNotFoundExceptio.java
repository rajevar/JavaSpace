package com.aloha4.commands;

public class CommandNotFoundExceptio extends Throwable {
    public CommandNotFoundExceptio(String s) throws Exception {
        throw new Exception(s);
    }
}
