package com.justjava.ifelse.command;

public class SubtractOperator implements Operator {

    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}
