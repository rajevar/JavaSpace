package com.justjava.ifelse.enumOp;

public class OpEnumCalculator {
    public static int calculate(int a, int b, Op operator) {
        return operator.apply(a, b);
    }
}
