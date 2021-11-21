package com.justjava.ifelse.enumOp;


public enum EnumOperators implements Op {

    ADD {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    }
}

