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
    void multiplicationTest(){
        double expected = variable1 * variable2;
        Main.calculate(Main.CalculationMode.multiply, variable1, variable2);
        double actual = Main.result;
        assertEquals(expected, actual, "Multiplication error");
    }

}
