import fileHandler.FileHandler;
import fileHandler.TextConversion;
import main.Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

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

    @Test
    void fileHandlerTest() {
        String
                directory = "src/test/resources",
                fileName = "fileHandlerTestFile",
                key = "fileHandlerWorkingStatus",
                value = "yes";

        ArrayList<String> expected = TextConversion.combineLines(
                null, new ArrayList<>() {{
                    add(new String[] {key, value});
                }});

        FileHandler fileHandler = new FileHandler(directory);
        fileHandler.text.writeLines(fileName, fileHandler, expected);
        ArrayList<String> actual = fileHandler.text.readLines(fileName, fileHandler);

        assertLinesMatch(expected, actual, "FileHandler not working.");
    }
}
