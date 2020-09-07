package numbers;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintNumbersTest {
    @Test
    public void testPrintOneToTenNumbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        PrintNumbers pn = new PrintNumbers();
        pn.printOneToTenNumbers();
        String expectedOutput  = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n";
//        assertSame(expectedOutput,outContent);

        Assert.assertEquals(expectedOutput, outContent.toString());
    }


}
