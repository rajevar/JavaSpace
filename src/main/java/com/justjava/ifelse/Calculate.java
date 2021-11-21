package com.justjava.ifelse;

import com.justjava.ifelse.command.OperatorFactory;
import com.justjava.ifelse.enumOp.EnumOperators;
import com.justjava.ifelse.enumOp.OpEnumCalculator;

public class Calculate {

    public static void main(String[] args) {
        Calculate c = new Calculate();
        int sum = c.calculate(1,2, "add");
        int subtract = c.calculate(1,2, "subtract");
        System.out.println(" sum >  " + sum + " | sub : " + subtract);
        //c.calculate(1,2, "blah");

        OperatorFactory factory = new OperatorFactory();
        sum = factory.getOperator("add").execute(1,2);
        subtract = factory.getOperator("subtract").execute(1,2);
        System.out.println(" sum >  " + sum + " | sub : " + subtract);

        //factory.getOperator("blah").execute(1,2);

        sum = OpEnumCalculator.calculate(1,2, EnumOperators.ADD);
        subtract = OpEnumCalculator.calculate(1,2, EnumOperators.SUBTRACT);
        System.out.println(" sum >  " + sum + " | sub : " + subtract);
    }

    public int calculate(int a, int b, String operator) {
        int result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            result = a + b;
        } else if ("multiply".equals(operator)) {
            result = a * b;
        } else if ("divide".equals(operator)) {
            result = a / b;
        } else if ("subtract".equals(operator)) {
            result = a - b;
        } else {
            throw new IllegalArgumentException("Invalid Operator : " + operator);
        }
        return result;
    }
}
