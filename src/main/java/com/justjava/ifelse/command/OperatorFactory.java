package com.justjava.ifelse.command;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class OperatorFactory {
    Map<String, Operator> opMap = new HashMap<>();
    public OperatorFactory() {
        opMap.put("add", new AddOperator());
        opMap.put("subtract", new SubtractOperator());
    }

    public Operator getOperator(String op) {
        return Optional.ofNullable(opMap.get(op))
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator : " + op));
    }
}
