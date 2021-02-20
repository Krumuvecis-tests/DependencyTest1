import main.Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    static int variable;

    @BeforeAll
    static void initializator(){
        variable = 1;
    }

    @Test
    void firstTest(){
        double expected = variable;
        double actual = Main.variable;
        assertEquals(expected, actual, "Testing error");
    }

}
