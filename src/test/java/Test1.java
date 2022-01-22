import main.Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    static int variable1, variable2;

    @BeforeAll
    static void initialize(){
        variable1 = 2;
        variable2 = 3;
    }

    @Test
    void internalMultiplicationTest() {
        int expected = variable1 * variable2;
        int actual = Main.calculate(Main.CalculationMode.multiply_internally, variable1, variable2);
        assertEquals(expected, actual, "Multiplication error");
    }

    @Test
    void externalMultiplicationTest() {
        int expected = variable1 * variable2;
        int actual = Main.calculate(Main.CalculationMode.multiply_externally, variable1, variable2);
        assertEquals(expected, actual, "Multiplication error");
    }
}
