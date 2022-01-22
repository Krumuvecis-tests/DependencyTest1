package main;

import DependencyTest2.Calculator;

public class Main {

    public enum CalculationMode {
        multiply_internally,
        multiply_externally
    }

    public static int calculate(CalculationMode mode, int a, int b) {
        System.out.println("Calculations mode: " + mode);
        switch (mode) {
            case multiply_internally -> {
                return multiply(a, b);
            }
            case multiply_externally -> {
                return Calculator.multiply(a, b);
            }
            default -> { return 0; }
        }
    }

    /**
     * Returns the value of parameters multiplied.
     *
     * This method should get its result from outside source:
     * https://www.github.com/krumuvecis/DependencyTest2
     * DependencyTest2.src.arithmetics.Calculator
     */

    private static int multiply(int a, int b){

        return a * b;
    }

}
