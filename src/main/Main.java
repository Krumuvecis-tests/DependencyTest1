package main;

public class Main {

    public static int result = 0;

    public enum CalculationMode{
        multiply
    }

    public static void calculate(CalculationMode mode, int a, int b){
        System.out.println("Calculations mode: " + mode);
        result = multiply(a, b);
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
